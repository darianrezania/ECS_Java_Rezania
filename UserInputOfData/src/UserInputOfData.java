import java.util.Scanner;


public class UserInputOfData
{
	public static void main ( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String name, name2, login;
		int grade, ID;
		double salary, GPA;
		
		System.out.println("Pleae enter the following information so I can sell it for profit."); 
		
		System.out.println("First name:");
		name = keyboard.next();
		
		System.out.println("Last name:");
		name2 = keyboard.next();
		
		System.out.println("Grade (9-12):");
		grade = keyboard.nextInt();
		
		System.out.println("Student ID");
		ID = keyboard.nextInt();
		
		System.out.println("Login:");
		login = keyboard.next();
		
		System.out.println("GPA");
		GPA = keyboard.nextInt();
		
		System.out.println("Your Information");
		
		System.out.println("Login "+ login);
		
		System.out.println("ID "+ ID);
		
		System.out.println("Name "+ name);
		
		System.out.println("GPA "+ GPA);
		
		System.out.println("Grade "+ grade);
	}
}
