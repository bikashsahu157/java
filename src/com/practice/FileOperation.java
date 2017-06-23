package com.practice;
import java.io.*;
import java.util.Scanner;

public class FileOperation {
//second commit
	public static void main(String[] args) throws IOException {
  try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\file\\file1.txt"))) {
	  System.out.println("enter text here");
	  Scanner scan= new Scanner(System.in);
	  String content= scan.next();
	  bw.write(content);
	  System.out.println("Done");

	} catch (IOException e) {

		e.printStackTrace();

	}
  
  FileReader fr=new FileReader("C:\\file\\file1.txt");
  BufferedReader br=new BufferedReader(fr);
  String sr=br.readLine();
  //System.out.println(sr);
  //int length=sr.length();
  char ch[]=sr.toCharArray();
  
  int length=ch.length;
  
  for (int i=0;i<length;i++){
	  int count=0;
	  char firstChar=ch[i];
	  for (int j=i;j<length;j++){
	  if(firstChar==ch[j]){
		  count++;
		  
		  }
	  
  }
	  
	  System.out.println("character" + "  "+ firstChar+ "  "+"count" +"  "+count);
  }
	}

}
