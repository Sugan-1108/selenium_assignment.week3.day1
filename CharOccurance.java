package assignments.week3.day1;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str = "welcome to chennai";
		int count = 0;
		
		char[] charStr = str.toCharArray();
		int length = charStr.length;
		
		for (int i = 0; i < length; i++)
		{
		
			if(str.charAt(i) == 'e')
			count++;
			
		}
		
		System.out.println("Character Occurance of 'e' is :" +count);
	}

}
