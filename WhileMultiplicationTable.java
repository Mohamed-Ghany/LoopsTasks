import java.util.Scanner;

public class WhileMultiplicationTable {
//3-Create program that print all number multiplications.
	public static void main(String[] args) {
		
		int number = 1;  //create variable with name "number" & with initiate value = 1
		int multiplier; // create variable with name "multiplier" which will be entered by User
		
		Scanner userMutiplierInput = new Scanner(System.in);  
				System.out.println("Please enter the number that you want its Multiplication table :"); 
				multiplier=userMutiplierInput.nextInt();
		
		while (number<=12) {  // condition
	
		System.out.println(multiplier +" * "+number+"  ="+(number* multiplier));
		number++;   //make Step to Guarantee that every time/loop number will be increased/incremented with 1 till it reach the condition 12
		
		}
	}
}
