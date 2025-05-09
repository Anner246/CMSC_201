import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/*
 * Class: CMSC201 
 * Instructor: Grigoriy Grinberg
 * Description:
 * This Statistics program determines the mean and standard deviation of a 10 number 
 * data-set given by the user
 * Due: 02/24/2025
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Anner Arevalo
*/

public class Statistics
{
	// Creating a scanner to take user input
	public static Scanner input = new Scanner(System.in);
	
	// Creating a global scope ArrayList called numbers to hold the users inputs
	public static ArrayList<Double> numbers = new ArrayList<>();
	
	// This main method call the introduction and end methods to run the program	
	public static void main(String[] args)
	{
		double sum = introduction();
		end(sum);
	}
	
	/**
	 * This introduction method prints out the title of the program and prompts the user for 10 numbers
	 * @return answer: the sum of the users inputs
	 */
	public static double introduction()
	{
		double answer = 0.0;
		boolean pass = false;
		String[] sections;
		String temp;
		System.out.println("Project 2: Statistics - compute mean and standard deviation");
		// Uses a while loop to prompt and add user inputs to the number ArrayList
		while(pass == false)
		{
			System.out.print("Enter a number 10 numbers seperated by a space: ");
			temp = input.nextLine();
			if(temp.charAt(0) == ' ')
			{
				System.out.println("No space at the beginning, please try again.");
				continue;
			}
			if(temp.charAt(temp.length()-1) == ' ')
			{
				System.out.println("No space at the end, please try again.");
				continue;
			}
			if(temp.contains("  "))
			{
				System.out.println("No double spaces, please try again.");
				continue;
			}
			sections = temp.split(" ");
			if(sections.length < 10)
			{
				System.out.println("Not enough numbers, please try again.");
				continue;
			}
			if(sections.length > 10)
			{
				System.out.println("Too many numbers, please try again.");
				continue;
			}
			pass = true;
			for(int i = 0; i < sections.length; i++)
			{
				try
				{
					numbers.add(Double.parseDouble(sections[i]));
				}
				catch(java.lang.NumberFormatException e)
				{
					System.out.println("Only enter numbers, please try again");
					pass = false;
					numbers.clear();
					break;
				}
			}
			
		}
		// Uses a for loop to go through the numbers ArrayList and calculate the sum
		for(int i = 0; i < numbers.size(); i++)
		{
			answer += numbers.get(i);
		}
		// Rounds the sum to five decimal places
		answer = roundUpToFiveDigits(answer);
		System.out.println("The sum is " + answer);
		return answer;
	}
	
	/**
	 * This calcMean method will calculate the mean of the users inputs
	 * @param num: the sum of the users inputs
	 * @return num divided by the size the numbers
	 */
	public static double calcMean(double num)
	{
		return roundUpToTwoDigits(num/numbers.size());
	}
	
	/**
	 * This CalcDev method uses the given equation to calculate the standard deviation
	 * @param num: The sum of the number ArrayList
	 * @return deviation: The standard deviation of the numbers ArrayList
	 */
	public static double calcDev(double num)
	{
		double deviation = 0.0;
		// Creates a double variable called dataSquared to store the sum of the values of the users
		// individual inputs squared
		double dataSquared = 0.0;
		// Uses a for loop to go through and square the individual values, and adds the result to dataSquared
		for(int i = 0; i < numbers.size(); i++)
		{
			dataSquared += numbers.get(i)*numbers.get(i);
		}
		// Plugs in the appropriate values into the equation
		deviation = ((dataSquared - ((num*num)/numbers.size()))/(numbers.size()-1));
		deviation = Math.sqrt(deviation);
		// Rounds the standard deviation value up to five decimal places
		deviation = roundUpToFiveDigits(deviation);
		return deviation;
	}
	
	/**
	 * This method end will display the mean and standard deviation of the numbers ArrayList,
	 * as well as the programmers name and the date
	 * @param num
	 */
	public static void end(double num)
	{
		System.out.println("The mean is " + calcMean(num));
		System.out.println("The standard deviation is " + calcDev(num));
		System.out.println("Student: Anner Arevalo");
		System.out.print("Date: 02/22/2025");
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
	
	/**
	 * The method roundUpToFiveDigits rounds a double up to two decimal places
	 * @param num: The number being rounded
	 * @return the number rounded to two decimal places
	 */
	public static double roundUpToTwoDigits(double num)
	{
		return new BigDecimal(num)
			.setScale(2, RoundingMode.HALF_UP)
			.doubleValue();
	}
}
