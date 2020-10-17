import java.util.*;
public class student {
	
	private String firstName;
	private String lastName;
	private int GradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance = 0;
	private  static int costOfCourse = 600;
	private static int id = 1000;
	
	
	// constructor: promote user to enter student's name and year
	
	public student() {
		
		java.util.Scanner in = new Scanner(System.in);		
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student Last name: ");
		this.lastName = in.nextLine();
				
		System.out.print("1- Freshmen\n2- Sophomore\n3- Junior\n4- Senior\nEnter student class level: ");
		this.GradeYear = in.nextInt();
		
		setStudentID();
		
			}
	
	// Generate ID
	
	private void setStudentID() {
		// Grade level + ID

		id++;
		this.studentID= GradeYear + ""+id;
		
	}	
	
	// Enroll to courses 	
	public void enroll() {
		//Get inside a loop, user hits 0
		
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses=  courses + "\n  " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				break;
			}
		} while (1 !=0);
		
		
		//System.out.println("ENROLLED IN: " + courses);
		
	}
	
	// View balance 	
	public void viewBalance() {
		
		System.out.println("Your balance is: $"+ tuitionBalance);		
	}
	
	// Pay Tuition
	
	public void payTuition() {
		
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("\n\nThank you for your payment of $" + payment);
		
		viewBalance();
		
	}
	// Show status
	
	public String toString() {
		
		return "Name: "+ firstName+" "+ lastName +
				"\nGrade levele: " + GradeYear + 	
				"\nStudent ID: " + studentID +
				"\nCourses enrolled: " + courses + 
				"\nBalance: $"+ tuitionBalance;
		
	}	
	
}
