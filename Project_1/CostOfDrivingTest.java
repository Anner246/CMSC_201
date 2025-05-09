

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CostOfDrivingTest
{
	static double distance;
	static double milesPerGallon;
	static double price;
	static double total;

	@BeforeEach
	void setUp() throws Exception
	{
		distance = 0.0;
		milesPerGallon = 0.0;
		price = 0.0;
		total = 0.0;
	}

	@AfterEach
	void tearDown() throws Exception
	{
		distance = 0.0;
		milesPerGallon = 0.0;
		price = 0.0;
		total = 0.0;
	}

	@Test
	void testmain()
	{
		distance = 900.5;
		milesPerGallon = 25.5;
		price = 3.55;
		total = CostOfDriving.calculate(distance, milesPerGallon, price);
		assertEquals(125.36, total);
		
		distance = 12.0;
		milesPerGallon = 24.0;
		price = 3.12;
		total = CostOfDriving.calculate(distance, milesPerGallon, price);
		assertEquals(1.56, total);
		
		distance = 30.0;
		milesPerGallon = 25.5;
		price = 3.22;
		total = CostOfDriving.calculate(distance, milesPerGallon, price);
		assertEquals(3.79, total);
		
		distance = 87.0;
		milesPerGallon = 28.0;
		price = 3.05;
		total = CostOfDriving.calculate(distance, milesPerGallon, price);
		assertEquals(9.48, total);
		
		distance = 115.5;
		milesPerGallon = 26.5;
		price = 2.90;
		total = CostOfDriving.calculate(distance, milesPerGallon, price);
		assertEquals(12.64, total);
	}
	
	@Test
	void testCalculate()
	{
		distance = 900.5;
		milesPerGallon = 25.5;
		price = 3.55;
		assertEquals(125.36, CostOfDriving.calculate(distance, milesPerGallon, price));

		
		distance = 12.0;
		milesPerGallon = 24.0;
		price = 3.12;
		assertEquals(1.56, CostOfDriving.calculate(distance, milesPerGallon, price));
		
		distance = 30.0;
		milesPerGallon = 25.5;
		price = 3.22;
		assertEquals(3.79, CostOfDriving.calculate(distance, milesPerGallon, price));

		distance = 87.0;
		milesPerGallon = 28.0;
		price = 3.05;
		assertEquals(9.48, CostOfDriving.calculate(distance, milesPerGallon, price));
		
		distance = 115.5;
		milesPerGallon = 26.5;
		price = 2.90;
		assertEquals(12.64, CostOfDriving.calculate(distance, milesPerGallon, price));

	}

}
