
public class Strings {
	
	public static void main(String[] args) {
	
		// A string is a sequence of characters
		// String is an object in Java
		// - data - sequence of chars
		// - methods - ways to look at the data
		
		//https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/String.html
		
		
		int score;
		score = 10;
		score = 12;
		
		double x = 1.72;
		
		String name;
		name = new String("Tyson");
		
		System.out.println(name.isEmpty());
		
		String empty;
		empty = new String("");
		System.out.println(empty.isEmpty());
		
		// Strings are weird in Java
		String magic;
		magic = "Magic";
		
		// anything between double quotes is called a string literal
		
		System.out.println("Hello world".length());
		name = "COMP 1501";
		
		// you can "add" strings with +
		System.out.println("Hello" + "World");
		// this is called concatination 
		
		printMyString(magic, 5);
		printMyString(name, 2);
		
		
		printStringLength(name);
		
		int count = countOfVowels(name);
		System.out.println(name);
		System.out.println(count);
		
		count = countOfVowels("A literal");
		System.out.println("A literal");
		System.out.println(count);
		
	}
	
	// methods are ways to group commands in Java
	
	// static - tells java that this isn't about an object 
	
	// return type - what type of data will your method give back
	//   - int, float -- something primitive
	//   - an Object Type
	//   - void -- nothing is returned
	
	// open and close brackets - methods parameters or arguments
	// add a list of variables which have values given when the method is called
	// can also be empty
	
	// arguments are assigned when the method is called, in order
	public static void printMyString(String stringToPrint, int times) {
		
		
		for (int i = 1; i <= times; i++) {
			System.out.println(stringToPrint);
		}
		
	
	}
	
	/**
	 * 
	 * Takes a string as an argument
	 * Will print "The string <string>  is  <#>  characters long.
	 * 
	 */
	public static void printStringLength(String stringToMeasure) {
		
		int length = stringToMeasure.length();
		
		System.out.format(
				"The string %s is %d characters long%n", 
				stringToMeasure,
				length);
		
	}
	
	/**
	 * 
	 * How many vowels does a string have?
	 * Will return the number of vowels in an argument string.
	 * 
	 * a, e, i, o, u
	 * 
	 */
	public static int countOfVowels(String stringToCount) {
		
		int length = stringToCount.length();
		
		int vowels = 0;
		
		for (int i = 0; i < length; i++) {
			char c = stringToCount.charAt(i);
			
			if (c == 'A') {
				vowels = vowels + 1;
			}
			if (c == 'E') {
				vowels = vowels + 1;
			}
			if (c == 'I') {
				vowels = vowels + 1;
			}
			if (c == 'O') {
				vowels = vowels + 1;
			}
			if (c == 'U') {
				vowels = vowels + 1;
			}
			if (c == 'a') {
				vowels = vowels + 1;
			}
			if (c == 'e') {
				vowels = vowels + 1;
			}
			if (c == 'i') {
				vowels = vowels + 1;
			}
			if (c == 'o') {
				vowels = vowels + 1;
			}
			if (c == 'u') {
				vowels = vowels + 1;
			}
		}
		
		
		
		return vowels;
		
	}
	
	
	
	
	
	
	
	
	
	

}
