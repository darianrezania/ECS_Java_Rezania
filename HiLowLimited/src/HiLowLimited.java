import java.util.Random;
import java.util.Scanner;

public class HiLowLimited
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int tries=1;
		int randomNum = 1 + r.nextInt(100);
		int guess = keyboard.nextInt();
		String response = "";
		
		System.out.println("I'm thinking of a number from 1 to 100. Try to guess it.");
		int choice = keyboard.nextInt();
		
		
		
		while(guess != randomNum && tries < 7)
		{
			if (randomNum > guess)
			{
				System.out.println("It is to low, guess again.");
				randomNum = keyboard.nextInt();
				
			}
			if (randomNum< choice)
			{
				System.out.println("It is to high, guess again.");
				randomNum = keyboard.nextInt();
				
			}

			if(randomNum == choice)
			{
				System.out.println("It is just right.");
			}
			System.out.println("The actual number was " + randomNum + "." );
			
			tries++;
			
		}
		
		
	}
}
