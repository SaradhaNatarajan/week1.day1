package week1.day2;

public class CharOccurance {
	public static void main(String[] args) {
		String val="welcome to chennai";
		
		int count=0;
		char[] charArray = val.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'n') {
				count++;
				
			}
			
		}
		System.out.println("count occurence of e: "+ count);
	}

}
