import java.util.Scanner;

public class SpaceBoxing
{	
	public static void main ( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int planet;
		double weight;
		
		System.out.println("Please enter your current weight:");
		weight = keyboard.nextDouble();
		System.out.println("Information for the other planets:");
		System.out.println("1. Venus  2.Mars   3. Jupiter");
		System.out.println("4. Saturn 5 Uranus 6. Neptune");
		planet = keyboard.nextInt();
		
	
		if (planet == 1)
		{ 
			System.out.println(weight*(0.78));
		}
		if (planet == 2)
		{
			System.out.println("Your weight would be "+weight*(0.39)+" on this planet");
		}
		if (planet == 3)
		{
			System.out.println("Your weight would be "+weight*(2.65)+" on this planet");
		}
		if (planet == 4)
		{
			System.out.println("Your weight would be "+weight*(1.17)+" on this planet");
		}
		if (planet == 5)
		{
			System.out.println("Your weight would be "+weight*(1.05)+" on this planet");
		}
		
		if (planet == 6)
		{
			System.out.println("Your weight would be "+weight*(1.23)+" on this planet");
		}
		
		
	}

}

