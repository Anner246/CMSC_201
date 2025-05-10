import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Class: CMSC201 
 * Instructor: Grigory Grinberg
 * Description: This is a JUnit test class meant to test the isPrime method from the PrimeNumberMethod class
 * Due: 05/12/25
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Anner Arevalo
*/

class PrimeNumberMethodTest
{
	
	@BeforeEach
	void setUp() throws Exception
	{
		
	}

	@AfterEach
	void tearDown() throws Exception
	{
		
	}

	@Test
	void testIsPrime()
	{
		// The isPrime method considers 0 as a prime number due to a logic error
		// A special case for 0 should be implemented to avoid this
		assertTrue(PrimeNumberMethod.isPrime(0) == false);
		assertTrue(PrimeNumberMethod.isPrime(2) == true);
		assertTrue(PrimeNumberMethod.isPrime(3) == true);
		assertTrue(PrimeNumberMethod.isPrime(4) == false);
	}

}