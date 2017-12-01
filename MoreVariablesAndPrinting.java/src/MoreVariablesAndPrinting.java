
public class MoreVariablesAndPrinting 
{ 
	public static void main( String[] args)
	{	
		String myName, myEyes = null, myTeeth, myHair;
		int myAge, myHeight, myWeight;
		
		
		myName= "Darian D. Rezania";
		myAge=14; 
		myHeight = 65;
		myWeight= 120;
		myTeeth= "white";
		myHair = "Brown";
		
		System.out.println(" Let's talk about " + myName+".");
		System.out.println( "He's" + myHeight+ " inches tall.");
		System.out.println("He's"+ myWeight + " poundsheavy.");
		System.out.println("Actually that's not that heavy."); 
		System.out.println("He's got"+ myEyes + " eyes and" + myHair + "hair");
		System.out.println("His teeth are  usually" + myTeeth + "depending on his coffee" );
		System.out.println("If I add" + myAge + ", " + myHeight+  ", and" + myWeight+ " I get" +(myAge+myHeight+myWeight) + ".");
		
	
	}

}
