
import java.util.Random;


public class ShorterDoubleDice
{
	public static void main ( String[] args )
	{
		
		Random r = new Random();
		
		int randomNum = 1+r.nextInt(6);
		int randomNum2= 1+r.nextInt(6);
		int total;
		String response = "";
		
		System.out.println("Here comes the dice");
		
		System.out.println("Roll #1 " + randomNum);
		System.out.println("Roll #2 " + randomNum2);
		System.out.println("The total is "+ (randomNum + randomNum2));
		
		 do {
             randomNum = 1 + r.nextInt(6);
             randomNum2= 2 + r.nextInt(6);
             total = randomNum + randomNum2;
                     
             System.out.println( "Roll #1: " + randomNum );
             System.out.println( "Roll #2: " + randomNum2 );
             System.out.println( "Your total is " + total + "!" );
         } while ( randomNum != randomNum2 );
     }
 }
 