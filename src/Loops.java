
public class Loops {
	
	public static void main(String[] args) {
		
		//squared();
		
		//checkPrimes();
		
		timesTable();
		
	}
	
	public static void squared() {
		
		// is list out every number from 1 - 10
		// and then list its square
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.printf("%d - %d %n", i, i * i);
			
		}
		
	}
	
	public static void checkPrimes() {
		
		for (int i = 3; i <= 20; i++) {
			System.out.printf("%d - %b %n", i, isPrime(i));
		}
		
	}
	
	public static boolean isPrime(int candidate) {
		// check if the example number is prime
		// a number is prime if it's only divisible by 1 and and itself
		// if we look at the remainder it will never be 0
		
		for (int i = 2; i < candidate; i++) {
			if ((candidate % i) == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void timesTable() {
		
		for (int i = 1; i <= 12; i++) {
			System.out.printf("%2d - ", i);
			for (int j = 1; j <= 12; j++) {
				System.out.printf(" %3d", i * j);
			}
			System.out.println();
			
		}
		
	}
	
	

}
