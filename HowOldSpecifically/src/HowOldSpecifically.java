import java.util.Scanner;



public class HowOldSpecifically 
{
	public static void main ( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("Hey, what's your name?");
		name = keyboard.next();
		
		System.out.println(" Ok " + name + ", how old are you?");
		age = keyboard.nextInt();
		
		if (age<16)
		{
			System.out.println("You cannot drive.");
		}
		else if (age >16)
		{	
			System.out.println("You can drive but can't vote.");
		
		}
		else if (age<17)
		{
			System.out.println("You can drive but can't vote.");
			
		}
		if (age>18)
		{
			System.out.println("You can do whatever you want.");
			
		}
		if (age>24)
		{
			System.out.println("You can do whatever you want.");
			
		}
		if (age>25)
		{
			System.out.println("You can do whatever you want.");
		}
		 
		
		
		
		
		
		
	}

}
