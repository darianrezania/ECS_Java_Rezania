import java.util.Scanner;

public class KeyboardInputs 
{
	public static void main ( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		String name;
		int age, feet, inches;
		double weight;
		
		System.out.println("What is your name");
		name = keyboard.next();
		
		System.out.println("How old are you?");
		age = keyboard.nextInt();
		System.out.println("How many feet tall are you?");
		feet = keyboard.nextInt();
		
		
		System.out.println("How many inches?");
		inches = keyboard.nextInt();
		
		System.out.println("How much do you weigh");
		weight= keyboard.nextInt();
		
		
		System.out.println("So your name is " + name +", you are " + age +" years old your " + feet + "'" +  inches +  " you weigh " + weight +  " pounds.");
		 
		keyboard.close();
		
		
	}

}
