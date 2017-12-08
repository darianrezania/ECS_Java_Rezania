import java.util.Random;


public class DoubleDice
{
	public static void main ( String[] args )
	{
		
		Random r = new Random();
		
		int randomNum = 1+r.nextInt(6);
		int randomNum2= 1+r.nextInt(6);
		String response = "";
		
		System.out.println("Here comes the dice");
		
		System.out.println("Roll #1 " + randomNum);
		System.out.println("Roll #2 " + randomNum2);
		System.out.println("The total is "+ (randomNum + randomNum2));
		
		while ( randomNum2!=randomNum)
		{
			
			 randomNum = 1+r.nextInt(6);
			randomNum2= 1+r.nextInt(6);
			
			System.out.println("Roll #1 " + randomNum);
			System.out.println("Roll #2 " + randomNum2);
			System.out.println("The total is "+ (randomNum + randomNum2));
		}
		
			System.out.println("The total for the double is "+ (randomNum + randomNum2));
			System.out.println("Roll #1 " + randomNum);
			System.out.println("Roll #2 " + randomNum2);
	}

}		