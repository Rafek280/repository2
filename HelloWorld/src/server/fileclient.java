package server;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class fileclient {

	public static void main(String[] args) throws Exception{
		
		//byte b[]=new byte[2002];
		Socket server=new Socket("localhost",40000);
		//InputStream is = sever.getInputStream();
		FileOutputStream fr = new FileOutputStream("C:\\Users\\Rafek\\Desktop\\Text.txt");
	//	is.read(b,0,b.length);
	//	fr.write(b, 0 ,b.length);
		
		Socket client;
	//	OutputStream out = client.getOutputStream();
	//	PrintWriter writer = new PrintWriter(out);
		
	//	InputStream in = client.getInputStream();
		//BufferedReader reader = new BufferedReader(new InputStream(in));
		
		System.out.print("Eingabe: ");
		Scanner eingabe = new Scanner(System.in);
		
	//	writer.write("Hallo Server!\n");
	//	writer.flush();
		eingabe.nextLine();
		
		 
		
	}

}
