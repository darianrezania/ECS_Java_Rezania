import java.util.Scanner;

public class FizzBuzz 
{
	public static void main (String [] args)
	{
		Scanner keyboard = new Scanner (System.in);
		 System.out.println( "Count to: " );

         
         for ( int n = 1; n <101; n++ ) 
         {
        	 if (n%5==0 && n%3 ==0)
     		{
     			System.out.println("FizzBuzz");
     		}
        	 else if(n%3==0)
    		{
    			System.out.println("Fizz");
    		
    		}
     		
             System.out.println( n + "\t" );
    		if (n%5==0)
    		{
    			System.out.println("Buzz");
    			
    
    		}
    		
         }
        
	
	}

}
