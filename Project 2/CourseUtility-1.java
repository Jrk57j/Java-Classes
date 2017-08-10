package course;
/**
 * Fills a course.
 * @author Julian Itwaru
 * @version 1.0
 */

import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



import address.Address;
import course.Course;
import student.Student;
import name.Name;


public class CourseUtility
{

	public static void courseInfo() throws FileNotFoundException//Throw the file not found
	{
		ArrayList<Student> students;
		Course course = new Course();
		Scanner scan = new Scanner(new File("data.txt"));
		
		//creates a list of students with two address and scores
		students = createStudent(scan);
		
		//create a course
		course = createCourse(students);
		
		//Displays the course
		displayCourse(course);
		
	}
	//Will fill the student ArrayList 
	private static ArrayList<Student> createStudent(Scanner scan)throws NumberFormatException
	{
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		while(scan.hasNext())
		{	//fills the constructor  without creating a null object.
			Name name = new Name(scan.next()," ", scan.next());
			scan.nextLine();//this is needed to keep the format that is being entered. 
			Address homeAddress = new Address(scan.nextLine(), scan.nextLine(), scan.nextLine(), Long.parseLong(scan.nextLine()));
			Address schoolAddress = new Address(scan.nextLine(), scan.nextLine(), scan.nextLine(), Long.parseLong(scan.nextLine()));
			Student nextStudent = new Student(name, homeAddress, schoolAddress);
			int[] scores = new int[6];
			for(int i = 0; i < scores.length; i++)
				{
				scores[i] = scan.nextInt();
				nextStudent.getScores();//fills the scores int array
				nextStudent.setScores(scores);//sets the scores int array
				}
			//Adds the student to the list to fill array
			studentList.add(nextStudent);
			nextStudent.toString();
			}	
		scan.close();
		
		return studentList;
		} 

		//Will fill the course via student array. 
		private static Course createCourse(ArrayList<Student> students)
		{
			Course course = new Course("Calculus");
		
			course.setStudents(students);
			course.getAverage();
			System.out.println(course.getAverage());
		
			return course;
		}
	
	
		//simple print line to display the course
		private static void displayCourse(Course course)
		{
			System.out.println(course);
		}

}	
	
	
	
	
	
	
