package com.training.assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.training.assignment.model.Employee;

public class DeserializationExample {
	public static void main(String[] args) {
		try{  
			  ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("C:\\STS workspace\\IOAssignments\\src\\main\\resources\\file.txt"));  
			 
			  Employee employee1=(Employee)objectInputStream.readObject();
			  Employee employee2 = (Employee)objectInputStream.readObject();
			
			  System.out.println(employee1.toString());
			  System.out.println(employee2.toString());

			  objectInputStream.close();  
		}catch(IOException | ClassNotFoundException e){
			System.out.println(e);
		} 	
	}
}
