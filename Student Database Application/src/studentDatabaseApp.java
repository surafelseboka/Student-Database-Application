import java.util.Scanner;


public class studentDatabaseApp {

	public static void main(String[] args) {
		
				
		// Ask how many new users we want to add
		System.out.print("Enter number of new students to enroll: ");		
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		student[] students = new student[numOfStudents];
		
		// Create n number of new students
		
		for (int n=0; n<numOfStudents; n++) {
			students[n] = new student();
			students[n].enroll();
			students[n].payTuition();
			
		}
		
		for (int n=0; n<numOfStudents; n++) {
			System.out.println(students[n].toString()); 
		}
	}

}
