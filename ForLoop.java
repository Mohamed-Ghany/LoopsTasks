import java.util.Scanner;

public class ForLoop {
//4-Create program that take 10 names from User and print them with “welcome message”.
	public static void main(String[] args) {
			
		
		for (int i=1; i<=10 ;i++) {   // for Loop : (first loop initialization = 0; Condition [ don't loop after the 10th time];increment every time )
			//if yes do the below statement:
			Scanner userInput = new Scanner(System.in);  //Scanner object
			System.out.println("Please enter the names Max by 10 trials :"); 
			String name=userInput.nextLine(); 
			System.out.println("welcome Mr/Mrs:"+name+" "+"..This's Trail number# "+i);
		}
			
	}
	}
