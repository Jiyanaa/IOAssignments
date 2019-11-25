package com.training.assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCountApplication {
	
	public static int printWordCount(String path) throws IOException {
		File file = new File(path);
		int wordCount = 0;
		
		if(file.exists() && file.isFile()) {
			FileInputStream fileInputStream = new FileInputStream(file);
			byte tempArray[] = new byte[(int) file.length()];
			fileInputStream.read(tempArray);
			String s = new String(tempArray);
			String[] stringArray = s.split("\\s+");
			wordCount = stringArray.length;
			
			System.out.println("Number of words:" + stringArray.length);
			
			fileInputStream.close();
		}
		else {
			System.out.println("Invalid path");
			throw new FileNotFoundException("File Not Found");
		}
		return wordCount;
		
	}
	
}
