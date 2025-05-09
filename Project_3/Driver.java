import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;

/*
 * Class: CMSC201 
 * Instructor: Grinberg Grigory
 * Description: This Driver program uses the student and Employee classes/subclasses to keep track
 * 				of a person and their information. The information being entered by the user 
 * 				is thoroughly checked to ensure that it is valid. At the end of the program 
 * 				the information is repeated back to the user.
 * Due: 04/07/2025
 * I pledge that I have completed the programming assignment independently.
 *  I have not copied the code from a student or any source.
 *  I have not given my code to any student.
 *  Print your Name here: Anner Arevalo
*/

public class Driver
{
	// This String ArrayList 'states' keeps track of valid states used to check the address entered
	private static String[] states = {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA",
			   						  "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD",
			   						  "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ",
			   						  "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC",
			   						  "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"};
	
	// This 'input' Scanner is used to read user inputs
	public static Scanner input = new Scanner(System.in);
	
	// This is the main method used to prompt the user for the information
	public static void main(String[] args)
	{
		// Here all the necessary variables needed to store and check the persons information are declared and initialized.
		int choice = 0;
		String name = "";
		String houseNumber = "";
		String streetName = "";
		String city = "";
		String state = "";
		String zipcode = "";
		String address = "";
		String phone = "";
		String email = "";
		String status = "";
		int office = 0;
		int salary = 0;
		String hours = "";
		String rank = "";
		String title = "";
		String tempDate = "";
		String startTime = "";
		String endTime = "";
		String ampm = "";
		String startDay = "";
		String endDay ="";
		int startDayNum = -1;
		int endDayNum = -1;
		boolean pass = false;
		
		// This while loop asks the user to choose whether they will create a student or employee by
		// entering an int value of 1 or 2 respectively.
		while(pass == false)
		{
			System.out.print("1) to create a Student" + "\n" + 
							 "2) to create an Employee" + "\n" +
				 		 	 "Choice: ");
			
			// These try and catch blocks ensure that the program continues to run even if the user
			// enters a string value instead of an int or double
			try
			{
				choice = input.nextInt();
			}
			catch (InputMismatchException e)
			{
				System.out.println("Incorrect entry, please try again:");
				input.nextLine();
				continue;
			}
			
			// Calls the checkChoice method to verify the users input is valid, if it is then the loop ends
			if(checkChoice(choice) == true)
				pass = true;
		}
		
		// Resetting the loop condition for the next while loop
		pass = false;
		
		// Getting rid of the newline at the end of the users previous input
		input.nextLine();
		
		// This while loop prompts the user for the persons name
		while(pass == false)
		{
			System.out.print("Enter a name (no numbers): ");
			name = input.nextLine();
			
			// Calls the checkName method to ensure the name is valid, if it is then the loop ends
			if(checkName(name) == true)
				pass = true;
		}
		
		// Resetting the loop condition for the next while loop
		pass = false;
		
		// This while loop prompts the user for the persons house number
		while(pass == false)
		{
			System.out.print("Enter " + name + "'s house number: ");
			houseNumber = input.nextLine();
			
			// Calls the checkHouseNumber method to ensure that the house number is valid, if it is then the loop ends
			if(checkHouseNumber(houseNumber) == true)
				pass = true;
		}
		
		// Resetting the loop condition for the next while loop
		pass = false;
		
		
		// This while loop prompts the user for the persons street name including the suffix(St., Ave., etc.)
		while(pass == false)
		{
			System.out.print("Enter " + name + "'s street name(streetname suffix): ");
			streetName = input.nextLine();
			
			// Calls the checkStreetName method to ensure the street name entered is valid, if it is then the loop ends
			if(checkStreetName(streetName) == true)
				pass = true;
				
		}
		
		// Resetting the loop condition for the next while loop
		pass = false;
		
		// This while loop prompts the user for the persons city name
		while(pass == false)
		{
			System.out.print("Enter " + name + "'s city: ");
			city = input.nextLine();
			
			// Calls the checkCity method to ensure the city name entered is valid, if it is then the loop ends
			if(checkCity(city) == true)
				pass = true;
		}
		
		// Resetting the loop condition for the next while loop
		pass = false;
		
		// This while loop prompts the user for the persons 2 letter state abbreviation
		while(pass == false)
		{
			System.out.print("Enter " + name + "'s state (Use the 2 letter abbreviation): ");
			state = input.nextLine();
			
			// Turns the users input into upper-case
			state.toUpperCase();
			
			// Calls the checkState method to ensure the state abbreviation entered is valid, if it is then the loop ends
			if(checkState(state) == true)
				pass = true;
		}
		
		// Resetting the loop condition for the next while loop
		pass = false;
		
		// This while loop prompts the user for the persons zipcode
		while(pass == false)
		{
			System.out.print("Enter " + name + "'s zipcode: ");
			zipcode = input.nextLine();
			
			// Calls the checkZipcode method to ensure the zipcode entered is valid, if it is then the loop ends
			if(checkZipcode(zipcode) == true)
				pass = true;
		}
		
		// Resetting the loop condition for the next while loop
		pass = false;
		
		// The houseNumber, streetName, city, state, and zipcode variables are all concatenated into a single
		// String variable called address
		address = houseNumber + " " + streetName + " " + city + ", " + state + " " + zipcode;
		
		// This while loop prompts the user for the persons phone number
		while(pass == false)
		{
			System.out.print("Enter " + name + "'s phone number(123-456-7890): ");
			phone = input.nextLine();
			
			// Calls the checkPhone method to ensure the phone number entered is valid, if it is then the loop ends
			if(checkPhone(phone) == true)
				pass = true;
		}
		
		// Resetting the loop condition for the next while loop
		pass = false;
		
		// This while loop prompts the user for the persons email
		while(pass == false)
		{
			System.out.print("Enter " + name + "'s email(Local@Domain): ");
			email = input.nextLine();
			
			// Calls the checkEmail method to ensure the email entered is valid, if it is then the loop ends
			if(checkEmail(email) == true)
				pass = true;
		}
		
		// Resetting the loop condition for the next while loop
		pass = false;
		
		// This if statement will prompt the user for either student or employee information based on their choice
		if(choice == 1)
		{
			// If the user wants to create a student then the following code will execute:
			// This loop asks for the students status
			while(pass == false)
			{
				System.out.print("Enter " + name + "'s class status(Freshman, Sophomore, Junior, Senior): ");
				status = input.nextLine();
				
				// Calls the checkStatus method to ensure that the status the user entered is valid
				if(checkStatus(status) == true)
					pass = true;
			}
			
			// Creates a new Student object named stud based on the users inputs for name, address, phone, email and status
			Student stud = new Student(name, address, phone, email, status);
			
			// The program prints out the toString method for the new Student object stud and then ends
			System.out.print(stud.toString());
		}
		
		// Else if the user wants to create an employee then the following code will execute:
		else
		{
			// This while loop asks for the employees office number
			while(pass == false)
			{
				System.out.print("Enter " + name + "'s office number(non-negative): ");
				
				// These try and catch blocks ensure that the program keeps running even if the user inputs a String value instead of an int or double
				try
				{
					office = input.nextInt();
				}
				catch (InputMismatchException e)
				{
					System.out.println("Incorrect entry, please try again:");
					input.nextLine();
					continue;
				}
				
				// Calls the checkOffice method to ensure that the office number the user entered is valid
				if(checkOffice(office) == true)
					pass = true;
			}
			
			// Resetting the loop condition for the next while loop
			pass = false;
			
			// This while loop asks the user for the employees salary
			while(pass == false)
			{
				System.out.print("Enter " + name + "'s salary(non-negative): $");
				
				// These try and catch blocks ensure that the program keeps running even if the user inputs a String value instead of an int or double
				try
				{
					salary = input.nextInt();
				}
				catch (InputMismatchException e)
				{
					System.out.println("Incorrect entry, please try again:");
					input.nextLine();
					continue;
				}
				
				// Calls the checkSalary method to ensure that the salary the user entered is valid
				if(checkSalary(salary) == true)
					pass = true;
			}
			
			// Getting rid of the newline at the end of the users previous input
			input.nextLine();
			
			// Resetting the loop condition for the next while loop
			pass = false;
			
			// This while loop asks the user for the employees hire date
			while(pass == false)
			{
				System.out.print("Enter " + name + "'s hire date(mm/dd/yyyy): ");
				tempDate = input.nextLine();
				
				// Calls the checkDate method to ensure that the date the user entered is valid
				if(checkDate(tempDate) == true)
					pass = true;
			}
			
			// Creates a new MyDate Object called 'date' based on the hire date the user entered
			MyDate date = new MyDate(tempDate);
			
			// Resetting the loop condition for the next while loop
			pass = false;
			
			// This while loop asks the user if the employee is Faculty or Staff by inputing an int value of 1 or 2 respectively
			while(pass == false)
			{
				System.out.print("1) to create a faculty member" + "\n" + 
				 		 		 "2) to create a staff member" + "\n" +
				 		 		 "Choice: ");
				
				// These try and catch blocks ensure that the program keeps running even if the user inputs a String value instead of an int or double
				try
				{
					choice = input.nextInt();
				
				}
				catch (InputMismatchException e)
				{
					System.out.println("Incorrect entry, please try again:");
					input.nextLine();
					continue;
				}
				
				// Calls the checkChoice method method to ensure the users input is valid
				if(checkChoice(choice) == true)
					pass = true;
			}
			
			// Resetting the loop condition for the next while loop
			pass = false;
			
			// Getting rid of the newline at the end of the users previous input
			input.nextLine();
			
			// If the user entered 1 to create a faculty member then the following code will execute:
			if(choice == 1)
			{
				// This while loop will ask the user to input the faculty members work hours and days
				while(pass == false)
				{
					// This do while loop prompts the user to enter the starting time for the faculty member shifts
					// It uses the checkTime method to ensure the time entered is valid
					do
					{
						System.out.print("Enter the start time for your shifts(xx:xx): ");
						startTime = input.nextLine();
					}while(checkTime(startTime) == false);
					
					// This do while loop prompts the user to enter the ending time for the faculty member shifts
					// It uses the checkTime method to ensure the time entered is valid
					do
					{
						System.out.print("Enter the end time for your shifts(xx:xx): ");
						endTime = input.nextLine();
					}while(checkTime(endTime) == false);
					
					// This do while loop prompts the user to enter whether their shift ends in the morning or in the afternoon
					// It uses the checkAmPm method to ensure the answer entered is valid
					do
					{
						System.out.print("Does your shift end am or pm: ");
						ampm = input.nextLine();
					}while(checkAmPm(ampm) == 3);
					
					// These nested do while loops prompt the user to enter the first and last days of the faculty members work week
					do
					{
						// This do while loop asks the user to input the first day of the faculty members work week
						do
						{
							System.out.print("Enter your first day working during the week, Monday being the first day of the week and Sunday being the last: ");
							startDay = input.nextLine();
							// The program calls the checkStartDay method to ensure that the day the user entered is valid
							startDayNum = checkStartDay(startDay);
						}while(startDayNum < 0);
						
						// This do while loop ask the user to input the last day of the faculty members work week
						do
						{
							System.out.print("Enter your last day working during the week, Monday being the first day of the week and Sunday being the last: ");
							endDay = input.nextLine();
							// The program calls the checkEndDay method to ensure that the day the user entered is valid
							endDayNum = checkEndDay(endDay, startDayNum);
						}while(endDayNum == 0);
						
					}while(endDayNum == 1);
					
					pass = true;
					
					// The program sets the variable ampm based on the checkAmPm method
					if(checkAmPm(ampm) == 1)
						ampm = "am";
					
					else if(checkAmPm(ampm) == 2)
						ampm = "pm";
					
					// The program concatenates the variables startTime, endTime, ampm, startDay and endDay into one String variable called hours
					hours = startTime + " - " + endTime + " " + ampm + ", " + startDay + " - " + endDay;
				}
				
				// The program asks the user to enter the faculty members rank
				System.out.print("Enter " + name + "'s rank: ");
				rank = input.nextLine();
				
				// The program creates a new Faculty object called fac based on the name, address, phone, email, office, salary, date, hours and rank entered
				Faculty fac = new Faculty(name, address, phone, email, office, salary, date.getDate(), hours, rank);
				
				// The program prints out the toString method for the new Faculty object fac and then ends
				System.out.print(fac.toString());
			}
			
			// If the user entered 2 to create a staff member then the following code executes:
			else
			{
				// The program asks the user to enter the staff members title
				System.out.print("Enter " + name + "'s title: ");
				title = input.nextLine();
				
				// The program creates a new Staff object called staff based on the name, address, phone, email, office, salary, date and title entered
				Staff staff = new Staff(name, address, phone, email, office, salary, date.getDate(), title);
				
				// The program prints out the toString method for the new Staff object staff and then ends
				System.out.print(staff.toString());
			}
		}
	}
	
	/**
	 * This checkName method ensures that the name the user entered is valid
	 * @param str: This is the name the user entered
	 * @return: true if the name is valid, false otherwise
	 */
	public static boolean checkName(String str)
	{
		// CHATGPT This if statement determines whether str contains any numbers, if it does then the method returns false,
		// if it doesn't then the method returns true
		if(str.matches(".*\\d.*"))
		{
			System.out.println("no numbers, please try again:");
			return false;
		}
		else
			return true;
	}
	
	/**
	 * This checkChoice method determines whether a users choice is a valid value(1 or 2)
	 * @param num: This is the choice the user inputed
	 * @return true if the value is equal to 1 or 2, otherwise returns false
	 */
	public static boolean checkChoice(int num)
	{
		if(num < 1 || num > 2)
		{
			System.out.println("Entry out of bounds, please try again:");
			return false;
		}
		else
			return true;
	}
	
	/**
	 * This checkHouseNumber method ensures that the user only inputs numbers for this part of the address
	 * @param str: The house number the user entered
	 * @return true if the user only entered numbers, false otherwise
	 */
	public static boolean checkHouseNumber(String str)
	{
		// CHATGPT This if statement determines whether str has anything other than numbers in it, if it does
		// then it returns false, if it doesn't then it returns true
		if(!(str.matches("\\d+")))
		{
			System.out.println("Only use numbers, please try again");
			return false;
		}

		return true;
	}
	
	/**
	 * This checkStreetName method determines whether the street name of the address is valid
	 * @param str: The street name of the address the user entered
	 * @return true if the street name is valid, false otherwise
	 */
	public static boolean checkStreetName(String str)
	{
		// This if statement determines whether str contains any numbers, if it does then it returns false
		if(str.matches(".*\\d.*"))
		{
			System.out.println("No numbers in the street name, please try again");
			return false;
		}
		
		// This if statement determines whether str contains a space in it, in other words it's making
		// sure the street name has the suffix included(St, Rd, Ave, etc.)
		// If str doesn't contain a space then it returns false
		if(!(str.contains(" ")))
		{
			System.out.println("That street name has the wrong format, please try again:");
			return false;
		}
		
		return true;
	}
	
	/**
	 * This checkCity method determines whether the city the user entered is valid
	 * @param str: The name of the city the user entered
	 * @return true of the city name is valid, false otherwise
	 */
	public static boolean checkCity(String str)
	{
		// This if statement determines whether str contains any numbers, if it does then it return false,
		// otherwise it returns true
		if(str.matches(".*\\d.*"))
		{
			System.out.println("No numbers in the city, please try again");
			return false;
		}
		
		return true;
	}
	
	/**
	 * This checkState method determines whether the state abbreviation the user entered is valid
	 * @param str: The state abbreviation the user entered
	 * @return true if the state abbreviation is valid, false otherwise
	 */
	public static boolean checkState(String str)
	{
		// This if statement determines whether the states ArrayList contains str,
		// if it does then it returns true, if it doesn't then it returns false
		if(!(Arrays.asList(states).contains(str)))
		{
			System.out.println("Invalid state abbreviation, please try again:");
			return false;
		}
		return true;
	}
	
	/**
	 * This checkZipcode method determines whether the zipcode entered is valid
	 * @param str: The zipcode the user entered
	 * @return true if the zipcode is valid, false otherwise
	 */
	public static boolean checkZipcode(String str)
	{
		// CHATGPT This if statement determines if str is five characters long and only contains numbers.
		// If those conditions are true then it true, it one or both are false then it returns false
		if(!(str.matches("\\d{5}")))
		{
			System.out.println("Zipcode must consist of only 5 digits, please try again:");
			return false;
		}
		return true;
	}
	
	/**
	 * This checkPhone method determines whether the phone number the user entered is valid
	 * @param str: The phone number the user entered
	 * @return true if the phone number is valid, false otherwise
	 */
	public static boolean checkPhone(String str)
	{
		// This if statement determines whether str is less than 12 characters long, if it is then it returns false
		if(str.length() < 12)
		{
			System.out.println("That phone number is to short, please try again:");
			return false;
		}
		
		// This if statement determines whether str is more than 12 characters long, if it is then it returns false
		if(str.length() > 12)
		{
			System.out.println("That phone number is to long, please try again:");
			return false;
		}
		
		// This if statement makes sure that the 4th and 8th characters of the phone number are '-',  if they aren't then it returns false
		if(str.charAt(3) != '-' || str.charAt(7) != '-')
		{
			System.out.println("That phone number is not in the correct format, please try again:");
			return false;
		}
		
		// This if statement determines whether str only contains numbers other than the two '-' characters, if it doesn't then it returns false
		if(!str.substring(0,3).matches("\\d+") || !str.substring(4,7).matches("\\d+") || !str.substring(8,12).matches("\\d+"))
		{
			System.out.println("The phone number should only contain 10 digits and 2 dashes, please try again:");
			return false;
		}
		
		return true;
	}
	
	/**
	 * This checkEmail method determines whether the email the user entered is valid
	 * @param str: The email the user entered
	 * @return true if the email is valid, false otherwise
	 */
	public static boolean checkEmail(String str)
	{
		// str is split into a String ArrayList, separated by a '@' character
		String[] sections = str.split("@");
		
		// This if statement checks to make sure that the email contains only one '@' character and no spaces,
		// if there are multiple or no '@' characters, or there are spaces in the email, then it returns false
		if(!str.contains("@") || !str.contains(".") || sections.length != 2 || str.contains(" ") == true)
		{
			System.out.println("That is not a valid email, please try again:");
			return false;
		}
		
		// This if statement makes sure that the first and last character of the local part of the email is not a special character
		if (!Character.isLetterOrDigit(sections[0].charAt(0)) ||
		    !Character.isLetterOrDigit(sections[0].charAt(sections[0].length() - 1)))
		{
			System.out.println("The local part of email cannot start or end with a special character, please try again:");
		        return false;
		}
		
		// This if statement determines whether the email contains a multiple periods in a row('..' or '...'), if it does then it returns false
		if(str.contains("..") == true)
		{
			System.out.println("An email cannot have '..', please try again:");
			return false;
		}
		
		// CHATGPT if the local or domain part of the email contains one of the following characters then this if statement returns false:
		// [, ], (, ), <, >, :, ;, ,, ", \
		if(sections[0].matches(".*[()<>\\[\\]:;,\"\\\\].*") || sections[1].matches(".*[()<>\\[\\]:;,\"\\\\].*"))
		{
			System.out.println("An email connot contain the following characters: '()<>[]:;,\"\\\\', please try again:");
			return false;
		}
		
		// CHATGPT This if statement ensure that the local part of the email only contains letters, numbers, and the following characters:
		// ., _, %, +, -
		// It also ensure that the domain only contains numbers, letters, at least one '.', and hyphens
		// If either the local or domain part of the email contains a character it shouldn't then it returns false
		if (!sections[0].matches("[A-Za-z0-9._%+-]+") || !sections[1].matches("[A-Za-z0-9.-]+\\.[A-Za-z]{2,}"))
		{
	        System.out.println("That is not a valid email format, please try again:");
	        return false;
	    }
		
		// CHATGPT This if statement makes sure that the domain part of the email starts and ends with either a letter or a number,
		// if it doesn't then it returns false
		if (!sections[1].matches("^[A-Za-z0-9]+([A-Za-z0-9-]*[A-Za-z0-9]+)?\\.[A-Za-z]{2,}$"))
		{
	        System.out.println("That is not a valid email format, please try again:");
	        return false;
	    }

		return true;
	}
	
	/**
	 * This chackStatus method ensures that the status the user entered is valid
	 * @param str: The status the user entered
	 * @return true of the status is valid, false otherwise
	 */
	public static boolean checkStatus(String str)
	{
		// This if statement determines whether the status is 'freshman', 'sophomore', 'junior' or 'senior' ignoring case, if it's not then it returns false,
		// if it is then it returns true
		if(!(str.equalsIgnoreCase("freshman")) && !(str.equalsIgnoreCase("sophomore"))
		   && !(str.equalsIgnoreCase("junior")) && !(str.equalsIgnoreCase("senior")))
		{
			System.out.println("Invalid input, please try again");
			return false;
		}
		return true;
	}
	
	/**
	 * This checkOffice method ensures that the office number the user entered is not negative
	 * @param num: The office number the user entered
	 * @return true if the office number is not negative, false otherwise
	 */
	public static boolean checkOffice(int num)
	{
		// This if statement determines whether num is negative, if it is then it returns false, if it's not then it returns true
		if(num < 0)
		{
			System.out.println("No negative numbers, please try again");
			return false;
		}
		return true;
	}
	
	/**
	 * This checkSalary method ensures that the salary the user entered is not negative
	 * @param num: The salary the user entered
	 * @return true if the salary is non negative, false otherwise
	 */
	public static boolean checkSalary(int num)
	{
		if(num < 0)
		{
			System.out.println("No negative numbers, please try again");
			return false;
		}
		return true;
	}
	
	/**
	 * This checkDate method ensures that the hiring date for an employee that the user entered is valid
	 * @param str: The hiring date for the employee that the user entered
	 * @return true if the date the user entered is valid, false otherwise
	 */
	public static boolean checkDate(String str)
	{
		// This if statement makes sure that str is 10 characters long and that the 3rd and 6th characters are '/', if one of these is not true then it returns false
		if(str.length() != 10 || str.charAt(2) != '/' || str.charAt(5) != '/')
		{
			System.out.println("Incorrect format, please try again:");
			return false;
		}
		
		// This if statement determines that str only contains numbers other than the two '/', if it doesn't then it returns false
		if(!str.substring(0,2).matches("\\d+") || !str.substring(3,5).matches("\\d+") || !str.substring(6,10).matches("\\d+"))
		{
			System.out.println("only use numbers and forward slashes, please try again:");
			return false;
		}
		
		// These variables month, day and year hold the month, day and year portions of str parsed into Integers
		int month = Integer.parseInt(str.substring(0, 2));
		int day = Integer.parseInt(str.substring(3, 5));
		int year = Integer.parseInt(str.substring(6, 10));
		
		// This if determines whether the month and day portions of str are between 1 and 12, as well as 1 and 31, if they aren't then it returns false
		if(month < 1 || month > 12 || day < 1 || day > 31)
		{
			System.out.println("That date does not exist, please try again");
			return false;
		}
		
		// This if statement makes sure that the month portion of str is a month that has 31 days if the day portion of str is 31, if it isn't then it returns false
		if((month == 4 || month == 6 || month == 9 || month == 11) && day == 31)
		{
			System.out.println("That date doesn't exist, please try again");
			return false;
		}
		
		// These nested if statement deal with February in particular because of how tricky it can get
		if(month == 2)
		{
			// CHATGPT This boolean variable isLeapYear determines whether the year portion of str is a leap year
			boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
			
			// This if statement determines whether the day portion of str is greater than 29, if it is then it returns false
		    if (day > 29)
		    {
		    	System.out.println("That date doesn't exist, please try again");
		    	return false;
		    }
		    
		    // This if statement determines whether the hiring date is a leap year if the day portion of str is 29, if its not then it returns false
		    if (day == 29 && !isLeapYear)
		    {
		    	System.out.println("That date doesn't exist, please try again");
		    	return false;
		    }
		}
		
		// CHATGPT This LocalDate object inputDate is created using the month, day and year variables parsed from str
		LocalDate inputDate = LocalDate.of(year, month, day);
		
		// CHATGPT This LocalDate object currentDate holds the current date the user is in
		LocalDate currentDate = LocalDate.now();
		
		// This if statement uses the inputDate and currentDate objects to determine if the hire date is a date that hasn't passed yet, if it is then it returns false
		if (inputDate.isAfter(currentDate))
		{
	        System.out.println("That date is in the future, please try again.");
	        return false;
	    }
		
		return true;
	}
	
	/**
	 * This checkTime method ensures that the office hours the user entered for the faculty are valid
	 * @param str: This is the office hours the user entered
	 * @return true if the office hours are valid, false otherwise
	 */
	public static boolean checkTime(String str)
	{
		// str is split into a String array called sections by a ':' character where the first index represents the hours and the second represents the minutes
		String[] sections = str.split(":");
		
		// This if statement determines whether the length of str is 5, the length of sections is 2 and that the 3rd character of str is a ':'
		// If one of these isn't true then it returns false
		if(str.length() != 5 || str.charAt(2) != ':' || sections.length != 2)
		{
			System.out.println("That is not a correctly formatted time, please try again:");
			return false;
		}
		
		// This if statement makes sure that str only contains numbers and a ':', if it doesn't then it returns false
		if(!sections[0].matches("\\d+") || !sections[1].matches("\\d+"))
		{
			System.out.println("There should only be four numbers and a ':', please try again:");
			return false;
		}
		
		// This if statement makes sure that the hour is between 1 and 12 and that the minute is between 1 and 59, if they aren't then it returns false
		if(Integer.parseInt(sections[0]) < 1 || Integer.parseInt(sections[0]) > 12 ||
		   Integer.parseInt(sections[1]) < 0 || Integer.parseInt(sections[1]) > 59)
		{
			System.out.println("That time doesn't exist, please try again:");
			return false;
		}
		
		return true;
	}
	
	/**
	 * This checkAmPm method ensure that the ending office hours have an AM or PM after them in order to improve clarity
	 * @param str: The user input
	 * @return 1 if str is am ignoring case, 2 if str is pm ignoring case and 3 otherwise
	 */
	public static int checkAmPm(String str)
	{
		// This if statement determines whether str is am ignoring case and if it is then it returns 1
		if(str.equalsIgnoreCase("am"))
			return 1;
		
		// This if statement determines whether str is pm ignoring case and if it is then it returns 2
		else if(str.equalsIgnoreCase("pm"))
			return 2;
		
		// If both of the previous if statements are false then this method returns 3
		else
		{
			System.out.println("That is not a valid answer, please try again:");
			return 3;
		}
	}
	
	/**
	 * This checkStartDay method ensures that the first work day of the week of the faculty member is valid
	 * @param str: This is the first work day of the week of the faculty member
	 * @return A number 1-7 representing the day of the week where 1 is Monday and 7 is Sunday, if str is not valid then it returns -1
	 */
	public static int checkStartDay(String str)
	{
		boolean answer = false;
		int num = -1;
		
		// Creates a String ArrayList of the days of the week
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		// Uses a for loop to go compare str to the indexes of the ArrayList, if one matches then it saves the index number
		for(int i = 0; i < days.length; i++)
		{
			if(days[i].equalsIgnoreCase(str))
			{
				answer = true;
				num = i;
				break;
			}
		}
		
		if(answer == false)
		{
			System.out.println("Invalid input, please try again:");
			return -1;
		}
		else
		{
			return num;
		}
	}
	
	/**
	 * This checkEndDay method ensures that the last work day of the week of the faculty member is valid
	 * @param str: This is the last work day of the week of the faculty member
	 * @param num: This is the number representing the first work day of the week of the faculty member
	 * @return 0 if str is not a real weekday, 1 if the last work day comes before the first, 2 if str exists and comes after the first work day
	 */
	public static int checkEndDay(String str, int num)
	{
		boolean answer = false;
		int firstDay = num;
		int lastDay = -1;
		
		// Creates a String ArrayList of the days of the week
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		// Uses a for loop to go compare str to the indexes of the ArrayList, if one matches then it saves the index number
		for(int i = 0; i < days.length; i++)
		{
			if(days[i].equalsIgnoreCase(str))
			{
				lastDay = i;
				answer = true;
				break;
			}
		}
		
		// This if statement returns 0 if str is not a real weekday
		if(answer == false)
		{
			System.out.println("Invalid input, please try again:");
			return 0;
		}
		
		// else it goes into this nested if statement
		else
		{
			// If the last day comes before the first day, for example Friday coming before Monday, then this if statement returns 1
			if(lastDay < firstDay)
			{
				System.out.println("The last day of your work week comes before your first day, please try again:");
				return 1;
			}
			// Else this method returns 2
			else
				return 2;
		}
	}
}