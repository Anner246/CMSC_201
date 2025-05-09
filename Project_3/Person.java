/*
 * Class: CMSC201 
 * Instructor: Grinberg Grigory
 * Description: This Person class creates a Person object
 * Due: 04/07/2025
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Anner Arevalo
*/

public class Person
{
	// The necessary variables are declared
	private String name = "";
	private String address = "";
	private String phone = "";
	private String email = "";
	
	// A Person constructor is made using the declared variables
	public Person(String name, String address, String phone, String email)
	{
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
}
