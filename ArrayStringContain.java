import java.util.Arrays;
import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class ArrayStringContain {
//8- Create program ask user to add strings to a list, then ask him to enter a string he wants to search it among the previous list 
	//& if the entered string is found: print it , but if not found: program show warning to User.
	public static void main(String[] args) {
	
		Scanner userInput = new Scanner(System.in);  
		System.out.println("Please Enter the Array Size:");
		int size =userInput.nextInt();
		System.out.println("Array Size is: "+size); //Print array Size
		
//Create the array :		
		String [] stringArray =new String[size]; //[Create array [String] initialize & contraction in the same line.."size is Int so add it in Square brackets ]
//create for loop:
		
		for (int counter = 0; counter < size; counter++) { 
				//Scanner is already created above		
				System.out.println("Please Enter the element/word number: "+(counter+1)); //+(counter+1) : so every time will mention the number of loop
				String word =userInput.next(); //variable "ward" to store the element user add...added nextLine() to add more than one word in the same line
				stringArray [counter]=word;				
			
		}
			
		System.out.println("The Array elements are : "+Arrays.toString(stringArray)); //Print the Array Elements
		
//Ask user to enter the ward he want to search for & store it :		
		System.out.println("\nPlease enter the word you want to search for: ");
		String word2=userInput.next(); //variable "ward2" store the word customer entered
//create Boolean to check if the ward2 exist in the array list		
		boolean containword = Arrays.toString(stringArray).contains(word2); //means is the array "stringArray" list contain the ward that user need to search for "word2" ?
		System.out.println(containword); // Print Result [ true or false ]
		
//create if-else 
		
		if (containword) { // if result was true 
			System.out.println("Yes the ward"+" " +word2+" is the List");
			
		} else {
             System.out.println("unfortunitly the ward"+" " +word2+" is Not exist the List");
		}
		  
			
		{

			userInput.close();
	
	
		}
	}
}
