import java.util.Scanner;

public class addingvaluesloop
{
	 public static void main( String[] args ) 
     {
  
		 	{
		 		Scanner keyboard = new Scanner (System.in);
		 		 System.out.print( "Count to: " );
		          int x = keyboard.nextInt();
		          for ( int n = 1; n <= x; n = n+1 ) 
		          {
		              System.out.println( n + "" );
		          }
		          System.out.println("The sum is");
		          System.out.print(x *(x +1) / 2);
		 		
		 	}

     }
 }

