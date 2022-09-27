/*Application: Project 3
 * Name: Dimitrius Morgan
 * Github User: dm2sh
 * Date: Sep 27, 2022
 * Version: 1.0
 * Description: Executing loops
 */

//imports scanner 
import java.util.Scanner;

public class morganProject3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reads input from keyboard
		Scanner keyboard = new Scanner (System.in);
		
		//stores name from keyboard input
		System.out.println("Enter a name");
		String name = keyboard.next();
		
		//stores number from keyboard input
		System.out.println("Enter a number between 0 and 100");
		int number = keyboard.nextInt();
		
		//determines if stored number is outside of 0 to 100 range, if so, asks for a new input
		//loop exits and moves onto confirmation loop when number is within 0 to 100 range
		while (!(number>0) || !(number<100))
		{
			System.out.println("Please enter a new number");
			number = keyboard.nextInt();
		}
		
		//determines if stored number is within 0 to 100 range and outputs a confirmation statement
		while (number>0 && number<100)
		{
			System.out.println("Thank you for your input, " + name);
			break;
		}
		
		//loop counts down to 0 from stored number
		for (int count = number; count>-1; count--)
		{
			System.out.println("You are " + count + " units away from 0!");
		}
		
		//prints out statement when count reaches 0
		System.out.println("You made it to 0!");
	}

}
