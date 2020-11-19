
public class Conditionals {

	
	public static void main(String[] args) {
		
		shouldWePaintIt(500, false);
		shouldWePaintIt(200, true);
		shouldWePaintIt(2000, true);
		shouldWePaintIt(2000, false);
		
	}
	
	public static void relatedToZero(int number) {
		
		if (number > 0) {
			System.out.println("Number is greater than zero");
		} else if (number == 0) {
			System.out.println("Number is zero");
		} else {
			System.out.println("Number is less than zero");
		}
		
		
		System.out.println("Done");
		
		
	}
	
	public static boolean validCoordinate(int x, int y) {
		
		// our imaginary screen is 1920 x 1080
		if (((x >= 0) && (x <= 1920)) && ((y >= 0) && (y <= 1080))) {
			return true;
		}
		
		return false;
	}
	
	public static void shouldWePaintIt(int area, boolean isItRed) {
		
		if ((isItRed) || (area > 1000)) {
			System.out.println("Don't paint it");
		} else {
			System.out.println("Paint it");
		}
		
	}
	
}
