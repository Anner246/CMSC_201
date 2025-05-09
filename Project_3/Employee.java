/*
 * Class: CMSC201 
 * Instructor: Grinberg Grigory
 * Description: This Employee class creates an Employee object which is an extension of the Person class
 * Due: 04/07/2025
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Anner Arevalo
*/

public class Employee extends Person
{
	// The necessary variables are declared
	private int officeNumber;
	private int salary;
	private MyDate dateHired;
	
	// An Employee constructor is made using the variables from both this class and the Person class
	public Employee(String name, String address, String phone, String email, int officeNumber, int salary, String dateHired)
	{
		super(name, address, phone, email);
		this.officeNumber = officeNumber;
		this.salary = salary;
		this.dateHired = new MyDate(dateHired);
	}
	
	public int getOfficeNumber()
	{
		return officeNumber;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public String getMyDate()
	{
		return dateHired.getDate();
	}
	
	public void setOfficeNumber(int newNum)
	{
		officeNumber = newNum;
	}
	
	public void setSalary(int newNum)
	{
		salary = newNum;
	}
	
	public void setDateHired(String newDate)
	{
		dateHired = new MyDate(newDate);
	}
}
