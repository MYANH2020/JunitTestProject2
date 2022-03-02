package test3;
/**
 * Name: My Anh Huynh
 * Class: SWE 3643 - Summer 2021
 * Assignment #4
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrintPrimesTest {
	@Test
	public void testPrintPrime1() {
		//test for the question number 2
		PrintPrimes test = new PrintPrimes();
		String result = test.printPrimes(1);
		
		assertEquals(" 1", PrintPrimes.printPrimes(0));
	}

	@Test
	public void testPrintPrime2() {
		//test for the question number 2
		PrintPrimes test = new PrintPrimes();
		String result = test.printPrimes(2);
		
		assertEquals(" 2", PrintPrimes.printPrimes(0));
	}
	@Test
	public void testPrintPrime3() {
		//test for the question number 3
		PrintPrimes test = new PrintPrimes();
		String result = test.printPrimes(3);
		
		assertEquals(" 2,3,5", PrintPrimes.printPrimes(0));
	}
	
	@Test
	public void testPrintPrime4() {
		//test for the question number 3
		PrintPrimes test = new PrintPrimes();
		String result = test.printPrimes(7);
		
		assertEquals(" 2,3,5,7,11,13,17", PrintPrimes.printPrimes(0));
	}
}
