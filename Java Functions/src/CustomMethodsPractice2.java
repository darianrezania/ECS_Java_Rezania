import java.util.Scanner;
import java.util.Random;
public class CustomMethodsPractice2
{
	public static void main( String[] args )
	{
		Random r = new Random();
		System.out.println("Here we go.");
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Some random numbers, if you please: ");
		int randomNum,randomNum2,n;
		String name;
		randomNum = 1 + r.nextInt(10); randomNum2 = 1 + r.nextInt(10);
		
		
		
		System.out.println("First: " + randomNum );
		System.out.println("Second: " + randomNum2 );
		if ( randomNum == randomNum2 )
			System.out.println("Hey!  They were the same!");
		else
			System.out.println("They were not the same.");

		System.out.println();
		System.out.println("More counting, but this time not by ones: 2 4 6 8 10 8 6 4 2");
		System.out.println();
		
        
		
		
		

		System.out.println();
		System.out.println("Let's figure a project grade.");
		int a=4,b=3,c=4,d=5,e=2,f=1, result=71;
		System.out.println("434521 -> " + result );

		System.out.println();
		System.out.println("Finally, some easy ones.");
		
		System.out.println("Please enter your name?" );
		name = keyboard.next();
		System.out.println("Hi, " + name );
		
		System.out.println();
		System.out.println("Do you feel lucky, punk?");
		System.out.println("You lose.");
	}

}