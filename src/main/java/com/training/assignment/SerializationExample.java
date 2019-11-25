package com.training.assignment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.training.assignment.model.Employee;

public class SerializationExample {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee(101, "Anagha", 30000.0);
		Employee employee2  = new Employee(102,"Veda",50000.0);
		try {
			
		File file = new File("C:\\STS workspace\\IOAssignments\\src\\main\\resources\\file.txt");
		
		//create new file  
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		
		//to create a stream for converting object to byte stream
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream); 
		
		//write into file
		objectOutputStream.writeObject(employee1);  
		objectOutputStream.writeObject(employee2);
		
		objectOutputStream.flush();
		//close the stream
		objectOutputStream.close();	
		fileOutputStream.close();
		System.out.println("Employee Record Added In File Successfully");
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}
}
