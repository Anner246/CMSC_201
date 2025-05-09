/*
 * Class: CMSC201 
 * Instructor: Grinberg Grigory
 * Description: This Student class creates a Student object and extends the Person class
 * Due: 04/07/2025
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Anner Arevalo
*/

public class Student extends Person
{
	// The necessary variables are declared
	private final String STATUS;
	
	// A Student constructor is made using the variables from both this class and the Person class
	public Student(String name, String address, String phone, String email, String status)
	{
		super(name,address,phone,email);
		this.STATUS = status;
	}
	
	public String getStatus()
	{
		return STATUS;
	}
	
	/**
	 * This toString method formats and prints out the information of a Student object
	 */
	public String toString()
	{
		return "Student: " + this.getName() + "\n" +
				"Status: " + this.getStatus() + "\n" +
				"Address: " + this.getAddress() + "\n" +
				"Phone number: " + this.getPhone() + "\n" +
				"Email address: " + this.getEmail();
	}
}