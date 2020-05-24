package server;

import java.io.File;
import java.nio.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import java.util.Scanner;

public class Readir {
	
	static File file = null;
	static File file2 = null;
	static String nameOfDirectory = null;
	static String fileName = null;
	static String fileContent = null;
	static String[] paths;
	
	public static void main(String[] args) {
		
		//directoryListing();
		//addFile();
		//removeFile();
		
	}
		
		public static void directoryListing(String nameOfDirectory){
		
		try {
		//	nameOfDirectory = "C:\\Users\\Rafek\\eclipse-workspace\\HelloWorld\\";
			file = new File(nameOfDirectory);
			paths = file.list();
			for(String path:paths)
			{
				System.out.println(path);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		}

		
		public static void addFile(String fileName, String fileContent) {
			
		try { 
			//fileName = "Beste.txt";
			file = new File(fileName);
			//fileContent = "Hallo";
			if(!file.exists()) {
				file.createNewFile();
			} 
			PrintWriter pw = new PrintWriter(file);
			pw.println(fileContent);
			pw.close();
			
			System.out.println("Done");
			
			
			
		}catch (IOException e) {
				e.printStackTrace();
			}
		file = new File("Beste.txt");
	
		}
	
		public static void removeFile(String fileName) {
			
		//fileName = "Beste.txt";
		file = new File(fileName);
		//fileContent = "Hallo";
		
		
		
		if(file.exists()) {
			file.delete();
		System.out.println( file2 +" got deleted");
	}
		else {
			System.out.println("For not deleted");
		}
			
		}
		
		public static void changeFilePermission() {
			
		file2.setWritable(true);
		file2.setReadable(false);
		file2.setExecutable(false);	
		
		System.out.println(file.canWrite());
		System.out.println(file.canRead());
		System.out.println(file.canExecute());
		}
	
	}


