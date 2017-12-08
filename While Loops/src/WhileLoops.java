import java.util.Scanner;

public class WhileLoops 
{	
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;
		
		System.out.println("WELCOME TO THE BANK OF Mitchell.");
		System.out.println("ENTER YOUR PIN");
		int entry = keyboard.nextInt();
		
		while ( entry != pin)
		{
			System.out.println("\nIncorrect pin try again.");
			System.out.println("Enter your Pin:");
			entry = keyboard.nextInt();
			
			
		}
		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}

}
