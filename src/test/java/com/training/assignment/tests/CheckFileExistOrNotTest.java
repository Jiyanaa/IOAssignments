package com.training.assignment.tests;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

import com.training.assignment.CheckFileExistOrNot;

public class CheckFileExistOrNotTest {

	@Test
	public void testForCheckingFileExistOrNotWithValidInput() throws FileNotFoundException {
		String path = "C:\\STS workspace\\IOAssignments";
		boolean result = CheckFileExistOrNot.checkFileIsExistOrNot(path);
		assertEquals(true,result);	
	}

	
	@Test(expected = FileNotFoundException.class)
	public void testForCheckingFileExistOrNotWithInValidPath() throws FileNotFoundException {
		String path = "C:\\STS workspace\\IOAssignments\\training";
		CheckFileExistOrNot.checkFileIsExistOrNot(path);
	}

}
