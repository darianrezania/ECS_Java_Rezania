import java.util.Scanner;

public class BMICalcBetter 
{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double weight = 0.0;
        double height = 0.0;
        double bmi = 0.0;

        System.out.print("Enter your weight in pounds: ");
        weight = input.nextInt();

        System.out.print("Enter your height: ");
        height = input.nextInt();

        bmi = ((weight * 703)/(height * height));

        System.out.println("Your BMI is "+ bmi+".");
        
        System.out.println( "BMI VALUES" );
        
        System.out.println("Underweight: Under 18.5");
        System.out.println("Normal: 18.5-24.9 ");
        System.out.println("Overweight: 25-29.9");
        System.out.println("Obese: 30 or over");
        if (bmi>30)
        {
        	System.out.println("You are obese");
        }
        if (bmi<18.5)
        {
        	System.out.println("You are underweight");
        }
        else if (bmi<24.9)
       {
        	 System.out.println("You are normal.");
       }
        else if (bmi<29.9)
        {
        	 System.out.println("You are overweight.");
        }
     }
}


