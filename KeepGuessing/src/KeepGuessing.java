import java.util.Random;
import java.util.Scanner;


public class KeepGuessing 
{
	public static void main ( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int randomNum = 1+r.nextInt(10);
		int guess;
		System.out.println("I have choosen a number between 1 and 10 guess it.");
		int guess1 = keyboard.nextInt();
		
		while ( guess1 !=randomNum)
		{
			System.out.println("\nIncorrect guess try again.");
			System.out.println("Enter your Guess:");
			guess1 = keyboard.nextInt();
			
			
		}
		System.out.println("\n Guess was correct.");
	}

}
