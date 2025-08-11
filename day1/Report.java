package week1.day1;

public class Report {

	    public static void main(String[] args) {
	        
	        // Create object for Student class
	        Student stu = new Student();
	        
	        // Assign values to variables
	        stu.studentName = "Harini R";
	        stu.rollNo = 101;
	        stu.collegeName = "ABC Engineering College";
	        stu.markScored = 480;
	        stu.cgpa = 8.7f;
	        
	        // Print all variables
	        System.out.println("Student Name: " + stu.studentName);
	        System.out.println("Roll No: " + stu.rollNo);
	        System.out.println("College Name: " + stu.collegeName);
	        System.out.println("Marks Scored: " + stu.markScored);
	        System.out.println("CGPA: " + stu.cgpa);
	    }
	}