package FRQ10;

public class Gcf {

	public static int gcf(int a, int b) {
		if( a % b == 0) {
			return b;
		}
		else {
			return gcf(b, a % b);
		}
	}
	
	
	public static String reduceFraction(int numerator, int denominator) {
		int gcf = gcf(numerator,denominator);
		return numerator/gcf + "/" + denominator/gcf;
	}

}
