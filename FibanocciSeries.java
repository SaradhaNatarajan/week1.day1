package week1.day1;

public class FibanocciSeries {

	public static void main(String[] args) {
                    
		int firstnum =0;
		int secondnum =1;
		int sum1;
		int input = 8;
		System.out.println("Fibonacci series are:" + firstnum);
		for (int i = 0; i < input; i++) {
			sum1 = firstnum  + secondnum;
			System.out.println("Fibonacci series are:" + sum1);
			firstnum = secondnum;
			secondnum = sum1;
		}
		
	}

}
