import java.util.Arrays;
import java.util.Scanner;

public class ArrayAverageForLoop {
//5- Create program that take numbers and create array of Integer sum all of elements and print total and average.
	public static void main(String[] args) {
		int sum = 0; // create variable called "sum" with initial value 0
		double average = 0; //create variable called "average" with initial value 0 & data type "double" as maybe will be decimal
		
		Scanner userInput = new Scanner(System.in);  
		System.out.println("Please Enter the Array Size:");
		int size =userInput.nextInt();
		int [] arrayNumber =new int [size]; //[Create array [integer] initialize & contraction in the same line ]
		
//Create For loop :	
		for (int i = 0; i < size; i++) { //Initial with 0 ; the condition ; the Step
			System.out.println("Please enter the "+"["+i+"]"+"index element :");
			int element =userInput.nextInt(); // create variable with name "element" to store the element values that will be entered by user
			arrayNumber [i] =element; 
			
			//sum = sum + element;
			sum+=element; //Get the Sum of element
			average=(float)sum/arrayNumber.length; //get the average by dividing the Sum/"Length of array" [Array name.Length] & add "float" before sum for decimal result
			
		}
		System.out.println("The Array elements are : "+Arrays.toString(arrayNumber)); //Print the Array Elements
		System.out.println("The Sum is :"+sum);    // Print the sum
		System.out.println("The Average is :"+average); // Print the average
	}
}

