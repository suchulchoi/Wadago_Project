package com.wadago;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex04 {
	 public static void main(String[] args) throws Exception {
		 ProcessBuilder pb=new ProcessBuilder("python", "C:\\Users\\mom\\Desktop\\test\\titanic.py");
		 Process p=pb.start();
		 BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream(), "utf-8"));
		 
		 try {
			 String line="";
			 while((line=br.readLine())!=null) {
				 System.out.println(line);
			 }
		 }finally {
			 try {
				 if(br!=null) {
					 br.close();
				 }
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
		 }
		 
	 }
}
