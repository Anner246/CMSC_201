import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
/*
 * Class: CMSC201 
 * Instructor: Grigoriy Grinberg
 * Description: The class CostOfDriving will determine the total cost of driving given a distance,
 * 				the price per gallon of gas and how many miles your car travels per gallon of gas.
 * Due: 02/03/2025
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Anner Arevalo
*/
public class CostOfDriving
{
	// Creating a Scanner so that the program can take user input.
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		// Creating variables to hold the distance of the drive, the amount of miles per gallon,
		// the price per gallon, and the total cost of the trip.
		double distance;
		double milesPerGallon;
		double price;
		double total;
		
		// The program asks the user for the distance of the drive.
		System.out.println("Enter the driving distance: ");
		
		// The user enters the distance in miles.
		distance = input.nextDouble();
		
		// The program asks the user for the number of miles their car travels per gallon.
		System.out.println("Enter how many miles your car travels per gallon: ");
		
		// The user enters the number of miles they get per gallon.
		milesPerGallon = input.nextDouble();
		
		// The program asks the user for the price of a gallon of gas.
		System.out.println("Enter the price per gallon of gas: ");
		
		// The user enters the price per gallon.
		price = input.nextDouble();
		
		// The program calls the calculate method and stores the value in the total variable.
		total = calculate(distance, milesPerGallon, price);
		System.out.println("The cost of driving is $" + total);
	}
	/**
	 * The method calculate determines the total cost of the trip and returns it correctly
	 * up to two decimal place.
	 * @param dist: The total distance in miles of the trip.
	 * @param mpg: The amount of miles the car gets per gallon.
	 * @param ppg: The price per gallon of gas
	 * @return
	 */
	public static double calculate(double dist, double mpg, double ppg)
	{
		double answer = 0.0;
		// First we calculate the gallons of gas needed by dividing the distance by the miles per gallon.
		// Then we multiply by the price per gallon to get the total cost of the trip.
		answer = ppg*(dist/mpg);
		return new BigDecimal(answer)
				.setScale(2, RoundingMode.HALF_UP)
				.doubleValue();
	}

}
