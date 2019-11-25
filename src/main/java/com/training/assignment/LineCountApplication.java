package com.training.assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineCountApplication {
	
	//using FileInputStream
	public static int printLineCount(String path) throws IOException {
		File file = new File(path);
		int lineCount = 0;
		
		if(file.exists()) {
			FileInputStream fileInputStream = new FileInputStream(file);
			byte tempArray[] = new byte[(int) file.length()];
			fileInputStream.read(tempArray);
			String s = new String(tempArray);
			String[] stringArray = s.split("\r\n");
			lineCount = stringArray.length;
			
			System.out.println("Number of lines:" + stringArray.length);
			
			fileInputStream.close();
		}
		else {
			System.out.println("File Not Found");
			throw new FileNotFoundException("File Not Found");
		}
		return lineCount;
		
	}
	

	//using bufferReader and fileReader
	public static int printLineCountUsingBufferReader(String path) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(path));
		int lineCount = 0;
		while (reader.readLine() != null) 
		{
			lineCount+=1;
		}
		reader.close();
		System.out.println("Number of lines:" + lineCount);
		return lineCount;
	}

}
