package com.training.assignment;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;

public class JavaGrepApplication {
	
	public static int FindString(String path, String str) throws IOException {

        if (!FileOperations.check(path))
            throw new FileNotFoundException("Path is not correct.");
        FileReader file = new FileReader(path);
        BufferedReader buffRead = new BufferedReader(file);
        int count = 1;
        String line = buffRead.readLine();
        while (line != null) {
            if (line.contains(str)) {
                System.out.println("Index where string found " + line.indexOf(str) + 1);
                return count;
            }
            count++;

 

        }
        return -1;

 

    }

 

    public static int FindStringStrict(String path, String str) throws IOException {
        
        if (!FileOperations.check(path))
            throw new FileNotFoundException("Path is not correct.");
        FileReader file = new FileReader(path);
        BufferedReader buffRead = new BufferedReader(file);
        int count = 1;
        String line = buffRead.readLine();
        while (line != null) {
            String tempArr[] = line.split("\\W+");
            for (int i = 0; i < tempArr.length; i++) {
                if (tempArr[i].equals(str)) {
                    System.out.println("String found at index is "+ (line.indexOf(str) + 1));
                    buffRead.close();
                    return count;
                }
            }
            count++;
            line = buffRead.readLine();
        }
        buffRead.close();
        return -1;

 

    }

 

    public static void main(String[] args) throws IOException {
        Thread t = new Thread(() ->  {
            try {
                int line = FindStringStrict("C:\\Users\\swayadav\\Documents\\StudyMaterials\\gitLecture.txt", "Git");
                if(line == -1)
                    System.out.println("String not found.");
                else
                    System.out.println("String found at line "+line);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        t.start();
        
        
    }

 
}
