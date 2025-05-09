/*
 * Class: CMSC201 
 * Instructor: Grinberg Grigory
 * Description: This Staff class creates a Staff object and extends the Employee class
 * Due: 04/07/2025
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Anner Arevalo
*/

public class Staff extends Employee
{
	// The necessary variable is declared
	private String title;
	
	// A Staff constructor is made using the variables from both this class and the Employee class
	public Staff(String name, String address, String phone, String email, int officeNumber, int salary, String dateHired, String title)
	{
		super(name, address, phone, email, officeNumber, salary, dateHired);
		this.title = title;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String newTitle)
	{
		title = newTitle;
	}
	
	/**
	 * This toString method formats and prints out the information of a Staff object
	 */
	public String toString()
	{
		return  "Staff: " + this.getName() + "\n" +
				"Title: " + this.getTitle() + "\n" +
				"Salary: $" + this.getSalary() + "\n" +
				"Date Hired: " + this.getMyDate() + "\n" + "\n" +
				"Office: " + this.getOfficeNumber() + "\n" +
				"Address: " + this.getAddress() + "\n" +
				"Phone Number: " + this.getPhone() + "\n" +
				"email: " + this.getEmail();
	}
}
