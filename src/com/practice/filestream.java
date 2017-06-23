package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class filestream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   try {
	FileOutputStream fos=new FileOutputStream("C:\\file\\file1.txt");
	 System.out.println("enter text here");
	  Scanner scan= new Scanner(System.in);
	  String content= scan.next();
	   scan.close();
	   //System.out.println(content);
	byte[] b=content.getBytes();
	fos.write(b);
	fos.close();
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   FileInputStream fis=new FileInputStream("C:\\file\\file1.txt");
   System.out.println(fis.read());
	}

}
