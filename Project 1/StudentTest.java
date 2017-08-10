package student;
/*
 * Test the Address, Name, and Student
 * @Author Julian Itwaru
 * Ver1.0
 */
import name.Name;
import address.Address;

import java.util.Scanner;

public class StudentTest 
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String firstName, middleName, lastName;
		String homeStreet, homeCity, homeState;
		String schoolStreet, schoolCity, schoolState;
		long homeZip, schoolZip;
		
		
		
		Name name1 = new Name("Julian", "Henry", "Itwaru");
		Name name2 = new Name("Bob", "The", "Builder");
		

		//test for user entered information 
		System.out.println("Enter student first name: ");//scans for first name via keyboard
		firstName = keyboard.nextLine();
		System.out.println("Enter students middle name: ");//scans for middle name via keyboard
		middleName = keyboard.nextLine();
		System.out.println("Enter students last name: ");//scans for last name via keyboard
		lastName = keyboard.nextLine();
		System.out.println("Enter home street:");//scans for home street via keyboard
		homeStreet = keyboard.nextLine();
		System.out.println("Enter home City: ");//scans for home city via keyboard
		homeCity = keyboard.nextLine();
		System.out.println("Enter home State: ");//scans for home state via keyboard
		homeState = keyboard.nextLine();
		System.out.println("Enter home Zip Code: ");//scans for home zip code via keyboard
		homeZip = keyboard.nextLong();
		keyboard.nextLine();
		Address userEnterHome = new Address(homeStreet, homeCity, homeState, homeZip);
		System.out.println("Enter school street: ");//scans for school street via keyboard
		schoolStreet = keyboard.nextLine();
		System.out.println("Enter school City: ");//scans for school city via keyboard
		schoolCity = keyboard.nextLine();
		System.out.println("Enter school State: ");//scans for school state via keyboard
		schoolState = keyboard.nextLine();
		System.out.println("Enter school Zip Code: ");//scans for school zip code via keyboard
		schoolZip = keyboard.nextLong();
		Address userEnterSchool = new Address(schoolStreet, schoolCity, schoolState, schoolZip);
		Name name = new Name(firstName, middleName, lastName);
		
		
		Address home = new Address("140 Wilgate rd", "Owings Mills", "MD", 21117);
		Address school = new Address("11307 frio creek", "San Antonio", "TX", 78245);
		Address extraadd = new Address("7828 laguna rd","middle river", "MD", 21698);
		//Address userEnterHome = new Address(homeStreet, homeCity, homeState, homeZip);
//		Address userEnterSchool = new Address(schoolStreet, schoolCity, schoolState, schoolZip);
		Student student1 = new Student(home, school, name2);
		Student student2 = new Student(school, home, name1);
		Student student3 = new Student(userEnterHome, userEnterSchool, name);
		System.out.println();
		System.out.println(student3);//produces a 
		System.out.println();
		
		
		
		//test setter and getters for address
		student1.setHomeAddress(home);
		student1.setSchoolAddress(school);
		System.out.println(student1.getHomeAddress());
		System.out.println();
		System.out.println(student1.getSchoolAddress());
		student2.setHomeAddress(school);
		student2.setSchoolAddress(extraadd);
		System.out.println();
		System.out.println(student2.getHomeAddress());
		System.out.println();
		System.out.println(student2.getSchoolAddress());
		System.out.println();
		
		
		//this just get test for all names
		System.out.println(name1.getFirst() + " " + name1.getMiddle()+ " " + name1.getLast());
		System.out.println();
		System.out.println(name2.getFirst()+" "+ name2.getMiddle()+" " + name2.getLast());
		
		//test equals output should be true false true false
		System.out.println(home.equals(home));
		System.out.println(school.equals(extraadd));
		System.out.println(student1.equals(student1));
		System.out.println(student1.equals(student2));
		System.out.println();
		
		//this is a set test for all names
		name1 = new Name("Steve", "The", "Slacker");
		name2 = new Name("The", "Muffin","Man");
		System.out.println(name2.getFirst()+" "+name2.getMiddle()+" "+name2.getLast()+ " Has the best muffins ever");
		System.out.println(name1.getFirst()+" " + name1.getMiddle()+ " "+ name1.getLast()+"is the best slacker of them all");
		
		//test to see if the student is changed 
		student1 = new Student( home, school,name2);
		student2 = new Student(extraadd, school, name1);
		System.out.println(student1.getName());
		System.out.println(student2.getName());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}		