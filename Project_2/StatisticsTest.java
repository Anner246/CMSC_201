import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

/*
 * Class: CMSC201 
 * Instructor: Grigoriy Grinberg
 * Description:
 * This Test class tests the methods in the Statistics class except for
 * the main method sine that is covered by the introduction and end method tests,
 * as well as the end method since it has a void return type
 * Due: 02/24/2025
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Anner Arevalo
*/

// This "@TestInstance(TestInstance.Lifecycle.PER_CLASS)" is to ensure the values of
// numbers and sum carry over through the different tests
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class StatisticsTest
{

	ArrayList<Double> numbers = new ArrayList<>();
	double sum = 0.0;
	@Test
	// This testIntroduction case goes first to ensure that the other tests function properly
	@Order(1)
	void testIntroduction()
	{
		// Use these values: 20, 34, 16, 3.4, 5.7, 89, -2, 11, -9, 10.6
		sum = Statistics.introduction();
		assertEquals(sum, 178.7);
	}

	@Test
	@Order(2)
	void testCalcMean()
	{
		assertEquals(Statistics.roundUpToTwoDigits(Statistics.calcMean(sum)), 17.87);
	}

	@Test
	@Order(3)
	void testCalcDev()
	{
		assertEquals(Statistics.calcDev(sum), 27.69284);
	}
	
	@Test
	void testRoundUpToFiveDigits()
	{
		assertEquals(Statistics.roundUpToFiveDigits(2.3647848), 2.36478);
	}
	
	@Test
	void testRoundUpToTwoDigits()
	{
		assertEquals(Statistics.roundUpToTwoDigits(2.3647848), 2.36);
	}

}
