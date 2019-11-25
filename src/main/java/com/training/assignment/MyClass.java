package com.training.assignment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.training.assignment.model.Employee;

public class MyClass {
	
	public static void main(String[] args) {
		Employee employee1, employee2, employee3, employee4, employee5;
		
		
		//5 Object of employee
		employee1 = new Employee(101, "Anagha", 30000.0);
		employee2  = new Employee(102,"Veda",50000.0);
		employee3 = new Employee(103,"Ansh",40000.0);
		employee4 = new Employee(104,"Sachi",20000.0);
		employee5 = new Employee(105,"Aditya",10000.0);
		
		
		List<Employee> employeeList = new ArrayList<Employee>(
				Arrays.asList(employee1, employee2, employee3, employee4, employee5));
		
		try {
			
			File file = new File("C:\\STS workspace\\IOAssignments\\src\\main\\resources\\fileArray.txt");
			
			//create new file  
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			
			//to create a stream for converting object to byte stream
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream); 
			
			//write into file
			objectOutputStream.writeObject(employeeList);
			
			objectOutputStream.flush();
			//close the stream
			objectOutputStream.close();	
			fileOutputStream.close();
			System.out.println("Employee Record List Added In File Successfully");
			}
			catch (IOException e) {
				e.printStackTrace();
			}
	}

}
