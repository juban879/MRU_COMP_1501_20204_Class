
public class Variables {

	public static void main(String[] args) {
		
		// variables, need a type and a name
		
		// name should always start lower case, then can be camel case
		// must start with a letter or a _
		int aWholeNumber; 
		float aRealNumber;
		char aLetter;
		boolean aTruth;
		
		// assign a value with a single = 
		// a literal is a number typed in your program
		aWholeNumber = 1;
		aWholeNumber = 100;
		aWholeNumber = 102;
		aWholeNumber = 1277211;
		
		// float numbers need an f after so java knows the right type
		aRealNumber = 1.3f;
		aRealNumber = 0.85f;
		
		// double is a double precision float (holds 10^308)
		double aBiggerRealNumber;
		aBiggerRealNumber = 1.3;
		aBiggerRealNumber = 0.0007;
		
		// letter literals are surrounded by single quotes
		aLetter = 'a';
		aLetter = 'Q';
		aLetter = ' ';
		aLetter = '~';
		aLetter = 'd';
		
		// boolean literals are true and false
		aTruth = true;
		aTruth = false;
		
		// shorts are small ints hold about ~ 32 0000
		short aSmallNumber;
		aSmallNumber = 20;
		
		// longs are large ints
		long aBigNumber;
		aBigNumber = 1000;
		
		
		// printing out println prints any variable with a new line after
		System.out.println(aRealNumber);
		System.out.println(aWholeNumber);
		System.out.println();
		System.out.println(aTruth);
		System.out.println(aLetter);
		
		// print prints the value without the new line
		System.out.print(aSmallNumber);
		System.out.println();
		
		// printf lets you do fancy formatting for your number
		System.out.printf("%d %f %n", aWholeNumber, aRealNumber);
		
		// you can use + to glue things together in println, but you shouldn't
		System.out.println(aRealNumber + " -> " + aTruth);
		
		// comparison
		// check if two variables are the same
		int x = 10;
		int y = 12;
		
		// == is used to ask if they're equal
		if (x == y) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		// < for less than and // > for greater than
		if (x < y) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		if (x > y) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		// <= for less than or equal too and >= for greather than or equal to
		if (x <= y) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		if (x >= y) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		// != for not equal to
		if (x != y) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		// arithmetic 
		double a = 3.3;
		double b = 10;
		double c;
		
		// floats work exactly the way you expect
		c = a + b; // addition
		System.out.printf("Result %f%n", c);
		c = a - b; // subtraction
		System.out.printf("Result %f%n", c);
		c = b - a;
		System.out.printf("Result %f%n", c);
		c = b * a; // multiplication
		System.out.printf("Result %f%n", c);
		c = a / b; // division
		System.out.printf("Result %f%n", c);
		
		x = 10;
		y = 3;
		// ints mostly work the same way too
		int z = x + y;
		System.out.printf("Result %d%n", z);
		z = x - y;
		System.out.printf("Result %d%n", z);
		z = y - x;
		System.out.printf("Result %d%n", z);
		z = y * x;
		System.out.printf("Result %d%n", z);
		z = y / x;
		System.out.printf("Result %d%n", z);
		z = y % x;
		System.out.printf("Result %d%n", z);
		z = x / y;
		System.out.printf("Result %d%n", z);
		z = x % y; // modulous or remainder
		System.out.printf("Result %d%n", z);
		
		// loops
		// can add a value to itself
		z = 0;
		System.out.printf("z %d%n", z);
		z = z + 1;
		System.out.printf("z %d%n", z);
		z = z + 1;
		System.out.printf("z %d%n", z);
		
		// z is our loop control variable
		z = 0;
		// z = 0 is our initial condition
		// z < 5 is our loop condition, terminal condition is when z >= 5;
		while (z < 5) {
			System.out.printf("z %d%n", z);
			// update statement
			z = z + 2;
			
		}
		
		// z += 1 is z = z + 1 but shorter
		z = 0;
		while (z < 5) {
			System.out.printf("z %d%n", z);
			z += 1;
			
		}
		
		// z++ is z = z + 1
		z = 0;
		while (z < 5) {
			System.out.printf("z %d%n", z);
			z++;
			
		}
		
		for (z = 0; z < 5; z++) {
			System.out.printf("z %d%n", z);
		}
		
		System.out.printf("a %f x %d%n", a, x);
		a = (double) x;
		System.out.printf("a %f x %d%n", a, x);
		// cast allows you to confirm that you might lose data
		x = (int) a;
		System.out.printf("a %f x %d%n", a, x);
		
		aSmallNumber = (short) aWholeNumber;
		System.out.printf("short %d int %d%n", aSmallNumber, aWholeNumber);
		
	}
	
	

}
