package com.training.assignment.tests;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import com.training.assignment.WordCountApplication;

public class WordCountApplicationTest {

	@Test
	public void testForCountWordsFromFile() throws IOException {
		
		String path = "C:\\STS workspace\\IOAssignments\\pom.xml";
		int count = WordCountApplication.printWordCount(path);
		assertEquals(23, count);
		
	}
	
	@Test(expected = FileNotFoundException.class)
	public void testForCountWordsForInvalidPathNamee() throws IOException {
		
		String path = "C:\\STS workspace\\IOAssignments";
		int count = WordCountApplication.printWordCount(path);		
	}

}
