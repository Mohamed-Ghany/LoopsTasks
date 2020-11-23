import java.awt.JobAttributes;
import java.util.Scanner;

//Requirement :2- Create program that take grade from user (A, B, C, D ,E) and print the defined range for that grade ("this grade start from 85 till 100").
	public class UserGradeDegree {

		public static void main(String[] args) {
		
		Scanner studentDegree = new Scanner(System.in);
		System.out.println("Please enter your Grade from A to E :");
		
		String studentGrade =studentDegree.nextLine();
		
		
		switch (studentGrade.toLowerCase()) {
		case "e": 
			System.out.println("Your grade in range of (0 to 50)");
			break;
		
		case "d": 
			System.out.println("Your grade in range of (50 to 65)");
			break;
			
		case "c": 
			System.out.println("Your grade in range of (65 to 75)");
			break;
		
		case "b": 
			System.out.println("Your grade in range of (75 to 85)");
			break;
			
		case "a":
			System.out.println("Your grade my be in range of (85 to 100");
		break;
		
		default:
			System.out.println("This is Not valid Grade..\nPlease try again and make sure it's A,B,C,D or E");
			break;
		}
		
		}
	}
