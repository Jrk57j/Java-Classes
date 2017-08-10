package student;
import name.Name;
import address.Address;

/**
 * Creates a generic student
 * @Author Julian Itwaru
 * Version 1.0
 */


public class Student implements Comparable<Student>
{
	/**
	 * Creates an address for this student
	 */
	
	private Address homeAddress;
	
	/**
	 * Creates a school address for this student
	 */
	
	private Address schoolAddress;
	
	/**
	 * Creates a name for this student
	 */
	
	private Name name;
	
	/**
	 * Creates long id
	 */
	
	private long id;
	
	/**
	 * Creates a long id for next student
	 */
	
	private static long nextID = 1000;
	
	/**
	 * Creates a test score int 
	 */
	
	
	/**
	 * Creates and array of test scores. 
	 */
	private int[] scores;


	
	
	
	/**
	 * Constructs a student with a default of null.
	 * @param  
	 * 
	 */
	public Student()
	{
	 	this(null, null, null);	
	}
	
	/**
	 * Constructs a student with name and two addresses, id, and test scores.
	 *
	 *@param homeAddress
	 *@param schoolAddress
	 *@param name
	 *@param scores
	 */
	public Student(Name name, Address homeAddress, Address schoolAddress) 
	{
		this.name = name;
		this.homeAddress = homeAddress; 
		this.schoolAddress = schoolAddress;
		this.id = nextID;
		nextID++;
		scores = new int[6]; 
	}
	


	/**
	 * Returns the address of this home.
	 *
	 * @return a string literal representation of this this address.
	 */

	public Address getHomeAddress()
	{
		return this.homeAddress;
	}
	
	/**
	 * Changes the address of this home.
	 *
	 * @param homeAddress address string literal for student home.
	 */
	
	public void setHomeAddress(Address homeAddress) 
	{
		this.homeAddress = homeAddress;
	}

	/**
	 * Returns the address of this school.
	 * 
	 * @return a string literal representation of student school address.
	 */
	
	public Address getSchoolAddress() 
	{
		return this.schoolAddress;
	}
	
	/**
	 * Changes the address of this school.
	 *
	 * @param schoolAddress address string literal for a school.
	 */

	public void setSchoolAddress(Address schoolAddress) 
	{
		this.schoolAddress = schoolAddress;
	}

	/**
	 * Returns the name of this student.
	 *
	 * @return a String literal representation of the student name. 
	 */
	
	public Name getName() 
	{
		return this.name;
	}
	
	/**
	 * Changes the name of the student.
	 * 
	 * @param name A String literal representation of a student name. 
	 */
	public void setName(Name name)
	{
		this.name = name;
	}
	
	/** 
	 * Returns a String representation of this name, school address and home address. 
	 * 
	 * @return A String with a name, school address and home address.
	 */
	 
	
	/**
	 * Returns the id.
	 * @return  id  A long number for the id.
	 */
	public long getId() {
		return this.id;
	}

	/**
	 * returns the id.
	 * 
	 * @return  nextID A long number for id.
	 */
	public static long getNextID() {
		return nextID;
	}

	
	/**
	 * Returns the score of the test.
	 * @param scores
	 * @return scores A integer representation of test scores. 
	 */
	public int[] getScores()
	{
		return scores;
	}
	
	public void setScores(int[] scores)//this will need its own text file for scores. 
	{
		this.scores = scores;
	}
	
	/**
	 * Returns the class average.
	 * 
	 * @return CalculateAverage A double integer for the class average. 
	 */
	public double getAverage()
	{
		double average = 0;
		double sum = 0;
		
		for (int i=0; i < this.scores.length; i++){
			sum = sum + (this.scores[i]);
		} 
		average = sum / this.scores.length;
		return average;
	} 
	
	
	/**
	 * Returns a string representation of the Course with id.
	 * @return toString a string representation of the Course with id.
	 */
	public String toString() 
	{
		String result;
		
		result = this.name.toString()+" " + this.id+"\n";
		result += this.homeAddress + "\n " + this.schoolAddress + "\n " ;
		for(int i = 0; i < scores.length; i++)
		{
			result +=  this.scores[i] + " ";
		}
		return result;
	}
	
	/**
	 * Indicates if this Student "equal to" some other object. If some other object is not a student, return false 
	 * to indicate "not equal to" relationship. If some other object is a name, they are equal if their last name, 
	 * first name, and middle names are equal.
	 * 
	 * @param obj A reference to some other object
	 * @return A boolean value specifying if this Student is "equal to" some other object
	 */
	
	public boolean equals (Object obj) 
	{
			if (!(obj instanceof Student)) 
			{
					return false;
			}
			/*
			 * Compares the Students by id. 
			 */
			Student other = (Student) obj;
			return this.id == (other).id;
	}

	/**
	 * This interface imposes a total ordering on the objects of each class that implements it.
	 * This ordering is referred to as the classes natural ordering. Will produce a int value 
	 * for ordering. 
	 * 
	 * @param e
	 * @return int value. 
	 */
	public int compareTo(Student e) {
		if ((new Long(this.id)).compareTo(new Long(e.getId())) > 0){
			return 1;
		}else if((new Long(this.id)).compareTo(new Long(e.getId())) < 0){
			return -1;
		}else{
			return 0;
		}
	}

}	
