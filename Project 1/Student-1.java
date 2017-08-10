package student;
/*
 * Creates a aggregate link between Name and Address
 * @Author Julian Itwaru
 * Ver 1.0
 */
import name.Name;
import address.Address;

public class Student 
{
	/*
	 * creates an address for this student
	 */
	
	private Address homeAddress;
	
	/*
	 * creates a school address for this student
	 */
	
	private Address schoolAddress;
	
	/*
	 * creates a name for this student
	 */
	
	private Name name;

	/*Constructs a student with name and two addresses 
	 *
	 *@param homeAddress
	 *@param schoolAddress
	 *@param name
	 */
	
	public Student()
	{
		this.homeAddress = null;
		this.schoolAddress = null;
		this.name = null;
	}
	
	public Student(Address homeAddress, Address schoolAddress, name.Name name) 
	{
		this.homeAddress = homeAddress;
		this.schoolAddress = schoolAddress;
		this.name = name;
	}
	

	/*
	 * Returns the address of this home
	 * @return a string literal representation of this this address
	 */
	


	public Address getHomeAddress()
	{
		return this.homeAddress;
	}
	
	/*
	 * Changes the address of this home
	 * @param A address string literal for student home
	 */
	
	public void setHomeAddress(Address homeAddress) 
	{
		this.homeAddress = homeAddress;
	}

	/*
	 * Returns the address of this school
	 * @return a string literal representation of student school address
	 */
	
	public Address getSchoolAddress() 
	{
		return this.schoolAddress;
	}
	
	/*
	 * Changes the address of this school
	 * @param A address string literal for a school
	 */

	public void setSchoolAddress(Address schoolAddress) 
	{
		this.schoolAddress = schoolAddress;
	}

	/*
	 * Returns the name of this student 
	 * @return a String literal representation of the student name 
	 */
	
	public Name getName() 
	{
		return this.name;
	}
	
	/*
	 * 
	 * Changes the address of this name
	 * @param A address string literal of this student name
	 */
	
	public void setName(Name name)
	{
		this.name = name;
	}
	
	/** 
	 * Returns a String representation of this name, school address and home address. 
	 * 
	 * @return A String with a name, school address and home address
	 */
	 
	
	public String toString() 
	{
		String result;
		
		result = this.name + "\n";
		result += this.homeAddress + "  " + this.schoolAddress + "  " ;
		
		return result;
	}
	
	/**
	 * Indicates if this Student "equal to" some other object. If some other object is not a student, return false 
	 * to indicate "not equal to" relationship. If some other object is a name, they are equal if their last name, 
	 * first name, and middle names are equal.
	 * 
	 * @param Obj A reference to some other object
	 * @return A boolean value specifying if this Student is "equal to" some other object
	 */
	
	public boolean equals (Object obj) 
	{
			if (!(obj instanceof Student)) 
			{
					return false;
			}
			/*
			 * Compares the Students in three parts. 
			 */
			Student other = (Student) obj;
			return this.name.equals (other.name) &&
				   this.homeAddress.equals (other.homeAddress) &&
				   this.schoolAddress.equals (other.schoolAddress);
	}


	
	
}
