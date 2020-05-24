package server;

import java.io.*;
import java.net.*;

public class fileserver {

		static Readir serverFiles = new Readir();
		static Socket clientSocket=null;
		
	public static void main(String[] args) throws Exception {
	
		ServerSocket server = new ServerSocket(40000);
		
	//	FileInputStream fr=new FileInputStream("C:\\Users\\Rafek\\eclipse-workspace\\HelloWorld\\Text.txt");
		
		
		Readir.changeFilePermission();
		
		try {
		clientSocket = server.accept();
		System.out.println("server lauft");
		System.out.println("Warte auf Client...");
		while(true) {
		clientSocket = server.accept();
		System.out.println("Client verbunden");
		
		}
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		
		
	//	byte b[]=new byte[2002];
	//	fr.read(b,0,b.length);
	//	PrintWriter out = new PrintWriter(client_socket.getOutputStream(),true);
	//	BufferedReader in = new BufferedReader
	//	OutputStream os= sr.getOutputStream();
	//	os.write(b,0,b.length);
		
while(true) {
			
		}
	}

}
