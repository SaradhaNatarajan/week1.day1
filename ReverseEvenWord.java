package week1.day2;

public class ReverseEvenWord {
	public static void main(String[] args) {
		String test = "I am a tester engineer";
		String [] splitWord = test.split(" ");
		for (int i = 0; i < splitWord.length; i++) {
			
			if(i%2 != 0) {
				char[] evenWord = splitWord[i].toCharArray();
				for (int k = evenWord.length -1; k >= 0; k--) {
					
					System.out.print(evenWord[k]);
				}
				System.out.print(" ");
			}
			else
			{
				System.out.print(splitWord[i]+" ");
			}
		}
//		String charArray = splitWord.toString();
}
}
