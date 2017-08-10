package course;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import student.Student;
import course.Course; 

/**
 * Creates a generic course with a course limit of 20 students.
 * @author Julian Itwaru
 * @version 1.0 
 */

	public class Course{

		/**
		 * The name of this course
		 */
	
		private String name;
	
		/**
		 * The id of this course
		 */
	
		private long id;
	
		/**
		 * The next available id
		 */
	
		private static long nextID = 10000;
	
								
		/**
		 * Adds students 
		 */
		private ArrayList<Student> students;
		
		
		/**
		 * The limit of students per course
		 */
		private final int MAX_ENROLLMENT = 20;
	
	
		/**
		 * Constructs  This course with a id number default value null
		 * 
		 */
	
		public Course()
		{
			this(null);
		}
	
		/**
		 * Constructs this Course with a id number
		 * 
		 * @param course A reference to the course of this student.
		 * @param id a long reference to the course ID number.
		 */
	
		public Course(String name)
		{
			this.name = name;
			this.id = nextID;
			nextID++;
			this.students = new ArrayList<Student>();
			
		}

		/**
		 * Returns the name of the course
		 * @return the name
		 */
		public String getNamee() 
		{
			return name;
		}

		
		/**
		 * Changes the course of the course
		 * @param course the name to set
		 */
		public void setCourse(String name) 
		{
			this.name = name;
		}


		
		public  ArrayList<Student> getStudents()
		{
			return this.students;
		}
		
		
		/**
		 * Changes the student count and adds student
		 * 
		 * @param student
		 */
		
		public void setStudents(ArrayList<Student> students)
		{
			this.students = students;
		}
		
		public void addStudent(Student student)
		{
			this.students.add(student);
		}	
		
		
		/**
		 * Returns an id for the course. 
		 * 
		 * @return ID a static long that represents the course id.
		 */
		public long getId() 
		{
			return id;
		}


		/**
		 * Returns the nextID of the course.
		 * @return the nextID
		 */
		public static long getNextID() 
		{
			return nextID;
		}
		
		
		
		/**
		 * Returns the class average as a double value.
		 * 
		 * @return getAverage Returns the class average as a double value.
		 */
		public double getAverage(){
			double average = 0;
			double sum = 0;
			
			for (int i=0; i < students.size(); i++){
				sum = sum + (students.get(i)).getAverage();
			} 
			average = sum / students.size();
			return average;
		}
		/**
		 * Returns a string representation of the Course.
		 * @return toString a string representation of the Course.
		 */
		public String toString()
		{
			String report = "";
			
			for(int i = 0; i < this.students.size(); i++)
			{
				report += this.name + this.id + "\n" +"Course average "+ getAverage()+"\n"+
						  this.students.get(i).toString()+"\n";
			}
			
			return getClass().getSimpleName()+ "\n"+ report;
			
		}
	
		/**
		 * Indicates whether some other object is "equal to " this name.
		 * If some other object is not name, returns a false statement. If
		 * some other object is "equal to" name return a true.
		 * @param obj A reference to some other object
		 * @return A boolean value specifying if this name is "equal to" some other object.
		 */
		public boolean equals(Object obj)
		{
			if(!(obj instanceof Course))
			{
				return false;
			}
			Course other = (Course)obj;
			this.students.trimToSize();;
			other.students.trimToSize();
		
		
		Collections.sort(this.students);
		Collections.sort(other.students);
		return Arrays.equals(this.students.toArray(), other.students.toArray());
	}
		
		/**
		 * This interface imposes a total ordering on the objects of each class that implements it.
		 * This ordering is referred to as the classes natural ordering. Will produce a int value 
		 * for ordering. 
		 * 
		 * @param e
		 * @return int value. 
		 */
		public int compareTo(Course e)
		{
		if ((new Long(this.id)).compareTo(new Long(e.getId())) > 0){
			return 1;
		}else if((new Long(this.id)).compareTo(new Long(e.getId())) < 0){
			return -1;
		}else{
			return 0;
		}
		
	}	
}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
