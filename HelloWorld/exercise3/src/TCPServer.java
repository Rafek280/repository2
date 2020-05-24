
import java.net.*;
import java.io.*;
import java.util.HashSet;

public class TCPServer {
    static PhoneBook parents;
    public static void main (String args[]) {
        parents = new PhoneBook("Eltern");
        parents.addEntry("Vater",111,"Strasse 2");
        parents.addEntry("Mutter",222,"Strasse 5");
        try{
            System.out.println("The Server is running");
            int serverPort = 7896;
            ServerSocket listenSocket = new ServerSocket (serverPort);
            while(true) {
                Socket clientSocket = listenSocket.accept();
                System. out.println("New Connection");
                Connection c = new Connection(clientSocket);
            }
        } catch( IOException e) {System.out.println(" Listen :"+ e.getMessage());}
    }// main
}//class


class Connection extends Thread {
 //   PhoneBook parents;
    DataInputStream in;
    DataOutputStream out;
    Socket clientSocket;
    ObjectOutputStream outStream;

    public Connection (Socket aClientSocket) {

        try {
            clientSocket = aClientSocket;
            outStream = new ObjectOutputStream(clientSocket.getOutputStream());
            inStream = new ObjectInputStream(clientSocket.getInputStream());
            out = new DataOutputStream ( clientSocket.getOutputStream() );
            in = new DataInputStream ( clientSocket.getInputStream() );
            this.start();
        } catch( IOException e) {System. out. println(" Connection:"+ e.getMessage());}
    }

    public void run(){
        try {
            Message receivedMessage = (Message) inStream.readObject();
            if(receivedMessage.message == 1){

                System.out.println("Received new entry: \n" + receivedMessage.name +"\n"+ receivedMessage.number +"\n"+ receivedMessage.description);
                TCPServer.parents.addEntry(receivedMessage.name,receivedMessage.number,receivedMessage.description);
                out.writeInt(TCPServer.parents.entries.size());
            }

            if(receivedMessage.message == 2){
                out.writeInt(TCPServer.parents.getAllEntries().size());
               HashSet<PhoneBookEntry> x = TCPServer.parents.getAllEntries();
                for(PhoneBookEntry y : x){
                    out.writeUTF(y.getName());
                }
                    //out.writeUTF(TCPServer.parents.getAllEntries().toString());
    }
            outStream.close();
            inStream.close();
            out.close();
            in.close();
            clientSocket.close();
        } catch( EOFException e) {System.out.println(" EOF:"+ e.getMessage());
        } catch( IOException e) {System.out.println(" IO:"+ e.getMessage());} catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}