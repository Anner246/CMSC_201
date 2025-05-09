/*
 * Class: CMSC201 
 * Instructor: Grinberg Grigory
 * Description: This Faculty class creates a Faculty object and extends the Employee class
 * Due: 04/07/2025
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Anner Arevalo
*/

public class Faculty extends Employee
{
	// The necessary variables are declared
	private String officeHours;
	private String rank;
	
	// A Faculty constructor is made using the variables from both this class and the Employee class
	public Faculty(String name, String address, String phone, String email, int officeNumber, int salary, String dateHired, String officeHours, String rank)
	{
		super(name, address, phone, email, officeNumber, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public String getOfficeHours()
	{
		return officeHours;
	}
	
	public String getRank()
	{
		return rank;
	}
	
	public void setOfficeHours(String newHours)
	{
		officeHours = newHours;
	}
	
	public void setRank(String newRank)
	{
		rank = newRank;
	}
	
	/**
	 * This toString method formats and prints out the information of a Faculty object
	 */
	public String toString()
	{
		return "Faculty: " + this.getName() + "\n" +
			   "Rank: " + this.getRank() + "\n" +
			   "Salary: $" + this.getSalary() + "\n" +
			   "Date Hired: " + this.getMyDate() + "\n" + "\n" +
			   "Office Hours: " + this.getOfficeHours() + "\n" +
			   "Office: " + this.getOfficeNumber() + "\n" +
			   "Address: " + this.getAddress() + "\n" +
			   "Phone Number: " + this.getPhone() + "\n" +
			   "email: " + this.getEmail();
	}
}
