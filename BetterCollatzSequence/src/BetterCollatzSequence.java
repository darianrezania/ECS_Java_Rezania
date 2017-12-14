import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;

public class BetterCollatzSequence
{
	public static void main ( String[] args)
	{
		System.out.println("Let's create a Collatz Sequence!.");
		
		System.out.println("Rules:");
		System.out.println("If the number is even divide it by two.");
		System.out.println("If the number is odd, multiply by 3 and add 1");
		System.out.println("Repeat this decision until you reach 1.");
		System.out.print("Starting Number ");
		Scanner input = new Scanner(System.in);
		int n;
		int even;
		int odd;
		int tries=1;
		int greatest;
		int largestnumber;

		n= input.nextInt();
		int max;
		max=n;
		System.out.print("[");
		System.out.print("" + n);
		do
			
		{	
			if(n%2==0)
			{
				n=(n/2);
				System.out.print("- " +n);
				tries++;
			}
			
			else
			{
				n= (3*n+1);
				System.out.print("- " +n);
				tries++;
				if (n>max)
				{
					max=n;
					
				}
			}
			
			
		} while (n>1);
		
		System.out.print("]");
		
		System.out.println( "It took " + tries + " times to terminate.");
		System.out.print("The highest value was "+ max );
	}
	
}

