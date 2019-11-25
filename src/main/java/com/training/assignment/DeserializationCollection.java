package com.training.assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;



public class DeserializationCollection {
	
	public static void main(String[] args) throws ClassNotFoundException {
		try{
			ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("C:\\STS workspace\\IOAssignments\\src\\main\\resources\\fileArray.txt"));
			
			System.out.println(objectInputStream.readObject());
			objectInputStream.close();  
		}catch(IOException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 	
	}

}
