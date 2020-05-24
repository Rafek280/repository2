
import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class TCPClient {
    public static void main (String args[]) {
        // args[0]: Message
        // args[1]: Server

        try{
            int serverPort = 7896;
            Socket s = new Socket ("localhost", serverPort);
                System.out.println("Enter number one to create a new entry in the phonebook");
                System.out.println("Enter number two for getting all entries in the phonebook");
                Scanner input = new Scanner(System.in);
                System.out.print("Please enter number: ");
                String msg = input.nextLine();
                int switchnumber = Integer.valueOf(msg);
                ObjectOutputStream outStream = new ObjectOutputStream(s.getOutputStream());
                ObjectInputStream inStream = new ObjectInputStream(s.getInputStream());
                DataOutputStream out = new DataOutputStream(s.getOutputStream());
                DataInputStream in = new DataInputStream(s.getInputStream());
                switch (switchnumber) {
                    case 1:
                        System.out.println("Type in three parameters for a new Entry");
                        System.out.print("Name: ");
                        String name = input.nextLine();
                        //  out.writeUTF(name);
                        System.out.print("Number: ");
                        Integer number = input.nextInt();
                        // out.writeInt(number);
                        input.nextLine();
                        System.out.print("Description: ");
                        String description = input.nextLine();
                        // out.writeUTF(description);
                        Message packet = new Message(switchnumber, name, number, description);
                        outStream.writeObject(packet);

                        Integer response = in.readInt();
                        System.out.println("The phonebook has now " + response + " entries");
                        break;
                    case 2:
                        Message getEntry = new Message(switchnumber);
                        outStream.writeObject(getEntry);
                        Integer entries = in.readInt();
                        for(int i = 0; i<entries;i++){
                            String responseEntry = in.readUTF();
                            System.out.println(responseEntry);
                        }
                       /* String responseEntry = in.readUTF();
                        System.out.println("All entries in the phonebook: ");
                        System.out.println(responseEntry);*/
                        break;
                    default:
                        System.out.println("Invalid number");
                        break;
                }
                input.close();
                outStream.close();
                s.close();
        }catch (UnknownHostException e){
            System.out.println(" Sock:"+ e.getMessage());
        }catch (EOFException e){ System.out.println(" EOF:"+ e.getMessage());
        }catch (IOException e){ System.out.println(" IO:"+ e.getMessage());}
    }// main
}// class