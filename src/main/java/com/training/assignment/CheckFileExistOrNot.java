package com.training.assignment;

import java.io.File;
import java.io.FileNotFoundException;

public class CheckFileExistOrNot {
	
	public static boolean checkFileIsExistOrNot(String path) throws FileNotFoundException {
		File file = new File(path);
		
		if(file.exists()) {
			System.out.println("File is Exist");
			return true;
		}
		else {
			System.out.println("File Not Exist");
			throw new FileNotFoundException("File not found");
		}
	}
}
