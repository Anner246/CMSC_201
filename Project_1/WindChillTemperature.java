import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
/*
 * Class: CMSC201 
 * Instructor: Grigoriy Grinberg
 * Description: The class WindChillTemperature will determine the coldness outside
 * 				by using the NWS wind-chill formula.
 * Due: 02/03/2025
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Anner Arevalo
*/

public class WindChillTemperature
{
	// Creating a Scanner so that the program can take user input
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		// Creating variables to hold values for the temperature and wind speed, as well the final answer windChill.
		// The v variable is to hold the value of an exponent calculation needed for the formula.
		// The final coefficient variables are for constant coefficient values for the formula
		double temp;
		double speed;
		double windChill;
		double v;
		final double FIRSTCOEFFICIENT = 35.74;
		final double SECONDCOEFFICIENT = 0.6215;
		final double THIRDCOEFFICIENT = 35.75;
		final double FOURTHCOEFFICIENT = 0.4275;
		final double FIFTHCOEFFICENT = 0.16;
		
		// The program asks the user to input a temperature between -58 and 41 degrees Fahrenheit,
		// the formula doesn't work with values outside of this range.
		System.out.println("Enter the temperature in Fahrenheit between -58F and 41F: ");
		
		// The user enters a temperature in range
		temp = input.nextDouble();
		while(temp < -58 || temp > 48)
		{
			System.out.println("You entered an incorrect temperature. Would you please enter the temperature in Fahrenheit between -58F and 41F: ");
			temp = input.nextDouble();
		}
		// The program asks the user for a winds speed greater than or equal to 2 in mph,
		// The formula won't work with a lower value.
		System.out.println("Enter the wind speed (>=2) mph: ");
		
		// The user inputs a wind speed greater than or equal to 2 mph.
		speed = input.nextDouble();
		
		while(speed < 2)
		{
			System.out.println("You entered an incorrect speed. Would you please enter the temperature in Fahrenheit between -58F and 41F: ");
			speed = input.nextDouble();
		}
		
		// The program calculates the value of the speed raised to the 0.16th power, this is needed for the formula
		v = Math.pow(speed, FIFTHCOEFFICENT);
		
		// The wind chill index is calculated and stored in windChill
		windChill = (FIRSTCOEFFICIENT + SECONDCOEFFICIENT*temp - THIRDCOEFFICIENT*v + FOURTHCOEFFICIENT*temp*v);
		
		// The program calls a method called roundUpToFiveDigits
		windChill = roundUpToFiveDigits(windChill);
		
		// The program displays the wind chill index correct to five decimal places
		System.out.println("The wind chill index is " + windChill);
		
	}
	/**
	 * The method roundUpToFiveDigits rounds a double up to five decimal places
	 * @param num: The number being rounded
	 * @return the number rounded to five decimal places
	 */
	public static double roundUpToFiveDigits(double num)
	{
		return new BigDecimal(num)
			.setScale(5, RoundingMode.HALF_UP)
			.doubleValue();
	}
}
