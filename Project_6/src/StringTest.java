import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Class: CMSC201 
 * Instructor: Grigory Grinberg
 * Description: This is a JUnit test class meant to test multiple methods from the super class String
 * Due: 05/12/25
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Anner Arevalo
*/

class StringTest
{
	String str;
	@BeforeEach
	void setUp() throws Exception
	{
		str = "String";
	}

	@AfterEach
	void tearDown() throws Exception
	{
		str = null;
	}
	
	// This test makes sure that the length method returns the correct length of a String Object
	@Test
	void testLength()
	{
		assertTrue(str.length() == 6);
	}
	
	// This test makes sure that the charAt method returns the correct character at a specified index of a String Object
	@Test
	void testcharAt()
	{
		assertTrue(str.charAt(0) == 'S');
		assertTrue(str.charAt(1) == 't');
		assertTrue(str.charAt(2) == 'r');
		assertTrue(str.charAt(3) == 'i');
		assertTrue(str.charAt(4) == 'n');
		assertTrue(str.charAt(5) == 'g');
	}
	
	// This test makes sure that the substring method returns the correct set of characters from a String Object
	// starting with the first parameter as the index (inclusive) and ending with the second parameter as the index (exclusive)
	@Test
	void testSubstring()
	{
		assertEquals(str.substring(0,3), "Str");
		assertEquals(str.substring(3,6), "ing");
	}
	
	// This test makes sure that the IndexOf method returns the correct index of a character String Object if it is included in the String
	// or -1 if the character is not present in the String Object
	@Test
	void testIndexOf()
	{
		assertTrue(str.indexOf('a') == -1);
		assertTrue(str.indexOf('S') == 0);
		assertTrue(str.indexOf('n') == 4);
	}
}