import java.util.Random;
import java.util.Scanner;


public class NumbGuessCount
{
	public static void main ( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int randomNum = 1+r.nextInt(10);
		int guess;
		int tries=1;
		
		System.out.println("I have choosen a number between 1 and 10 guess it.");
		int guess1 = keyboard.nextInt();
		
		do
		{
			
			guess1 = keyboard.nextInt();
			tries++; 
			
			
		
		
		System.out.println(" Guess was correct.");
		System.out.println(""+tries+"  tries."); 
		
	   
		
		
	}
	while( guess1 != randomNum);
  }
}
