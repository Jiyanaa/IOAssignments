package com.training.assignment.tests;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import com.training.assignment.LineCountApplication;

public class LineCountApplicationTest {

	//using file and fileInputStream
	@Test
	public void testForPrintNumberOfLineCountFromFile() throws IOException {
		int count = LineCountApplication.printLineCount("C:\\STS workspace\\IOAssignments\\pom.xml");
		assertEquals(21, count);
	}
	
	@Test(expected = FileNotFoundException.class)
	public void testForPrintNumberOfLineCountWithInvalidInput() throws IOException {
		LineCountApplication.printLineCount("C:\\STS workspace\\IOAssignments\\testing");
	}
	
	//using bufferReader and fileReader
	@Test
	public void testForPrintLineCountByUsingBufferReader() throws IOException {
		int count = LineCountApplication.printLineCountUsingBufferReader("C:\\STS workspace\\IOAssignments\\pom.xml");
		assertEquals(21, count);
	}

}
