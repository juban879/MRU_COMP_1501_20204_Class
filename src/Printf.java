import com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil;

public class Printf {

	
	public static void main(String[] args) {
		// printline prints out a string, and then a new line
		System.out.println("Hello World");
		System.out.println("Hello World");
		
		// print prints out a string without a new line
		// println prints out no string, but adds a new line
		System.out.print("Hello World");
		System.out.println();
		System.out.print("Hello World");
		System.out.println();
		
		//c++ output looks like this
		//cout << "Hello World";
		
		// if we want to combine strings we can us +
		System.out.println("Hello " + "World");
		String z = "COMP";
		System.out.println("Hello " + z);
		int y = 123;
		System.out.println("Hello " + y);
		
		// printf lets you print formatted strings
		System.out.printf("Hello World");
		System.out.printf("Hello World");
		
		// new line flag - %n
		System.out.printf("Hello World%n");
		System.out.printf("Hello World%n");
		System.out.printf("Hello %n%n%nW%no%nr%nld%n");
		
		// solves the os specific problem
		System.out.printf("Hello \n World\n");
		
		// if you want a tab
		System.out.printf("\tHello World%n");
		
		// we can also use flags to fill in variables
		// %s - is replaced with a string
		System.out.printf("You said: %s. %n", "Hi");
		String a = "Hi World!";
		System.out.printf("You said: %s. %n", a);
		
		// %S - is replaced with a string - IN CAPS
		System.out.printf("You said: %S. %n", a);
		
		// %d is replaced with an int type (int, long, short)
		System.out.printf("Number: %d%n", 12);
		
		for (int i = 1; i <= 11; i++) {
			System.out.printf("Number: %d%n", i);
		}
		
		// we can add padding to a flag
		// %#d says make # number spaces for a number
		for (int i = 1; i <= 11; i++) {
			System.out.printf("Number: %10d%n", i);
		}
		
		// %f - is replaces iwth a float type (float, double)
		System.out.printf("Floating point: %f%n", 1.457);
		System.out.printf("Floating point: %f%n", 1412321.457);
		
		// %#f - is replaced with padding
		System.out.printf("Floating point: %15f%n", 1.457);
		System.out.printf("Floating point: %15f%n", 1412321.457);
		
		// %.#f - is replaced with # of decimal points
		System.out.printf("Floating point: %.15f%n", 1.457);
		System.out.printf("Floating point: %.15f%n", 1412321.457);

		System.out.printf("Floating point: %.2f%n", 1.457);
		System.out.printf("Floating point: %.2f%n", 1412321.457);
		
		// %#.#f - is replaced with both padding and decimals
		
		System.out.printf("Floating point: %10.2f%n", 1.457);
		System.out.printf("Floating point: %10.2f%n", 1412321.457);
		
		// %% lets you draw a percent sign
		System.out.printf("Floating point: %10.2f%%%n", 1412321.457);
		
		// String.format - does the same thing, but gives a string back
		String result = String.format("Floating point: %10.2f%n", 1.457);
		System.out.print(result);
		System.out.println(result.length());
		
		

	}
	
}
