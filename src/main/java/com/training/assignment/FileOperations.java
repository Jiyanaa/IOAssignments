package com.training.assignment;

import java.io.File;

public class FileOperations {

	public static boolean check(String path) {
		File file = new File(path);
		if(file.isDirectory()) {
			return false;
		}
		return true;
	}

}
