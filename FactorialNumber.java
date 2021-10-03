package week1.day1;

public class FactorialNumber {

	public static void main(String[] args) {
		int factvalue = 6;
		int fact = 1;
		for (int i = 1; i <= factvalue; i++) {
			fact = fact*i;
			
		}
		System.out.println(factvalue + " Factorial value are " + fact);
		  
	}

}
