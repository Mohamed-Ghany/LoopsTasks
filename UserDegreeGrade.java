import java.awt.JobAttributes;
import java.util.Scanner;

public class UserDegreeGrade {
//1-Create program that take user result and decide his grade as follow :-A (85-100) -B (75-85) -C (65-75) D (50-65) - E (0-50)

	public static void main(String[] args) {
		
		Scanner studentGrade = new Scanner(System.in);
		System.out.println("Please Enter your Grade [ from 0 to 100 ]:");
		
		int studentDegree =studentGrade.nextInt();
		
		if (studentDegree >=0 && studentDegree< 50) {
			System.out.println("You Entered "+studentDegree+" "+"So Your Grade is = \"E\"");
		}
		if (studentDegree >=50 && studentDegree< 65) {
			System.out.println("You Entered "+studentDegree+" "+"So Your Grade is = \"D\"");
			
		} else if (studentDegree >=65 && studentDegree< 75) {
			System.out.println("You Entered "+studentDegree+" "+"So Your Grade is = \"C\"");
			
		} else if (studentDegree >=75 && studentDegree< 85) {
			System.out.println("You Entered "+studentDegree+" "+"So Your Grade is = \"B\"");
			
		}else if (studentDegree >=85 && studentDegree<= 100) {
			System.out.println("You Entered "+studentDegree+" "+"So Your Grade is = \"A\"");
		
	}else {
	
		System.out.println("You Entered "+studentDegree+" "+"and this's invalid degree..\nPlease Try again within range [ from 0 to 65 or from 75 to 100 ]");
		
	}
		
}
}