package assignments.week3.day1;

import java.util.Arrays;

public class Anagram {

	

	public static void main(String[] args) {
		
		String text1 = "stops";
		String text2 = "potss"; 
		
		if(text1.length() == text2.length())
		{
			char[] ArrayT1 = text1.toCharArray();
			char[] ArrayT2 = text2.toCharArray();
			Arrays.sort(ArrayT1);
			Arrays.sort(ArrayT2);
			
			if (Arrays.equals(ArrayT1, ArrayT2))
			{
				System.out.println("The given text is Anagram");
			}
			else
			{
				System.out.println("The given text is not Anagram");
			}	
		}	
		else
		{
			System.out.println("The given text is not Anagram--length is mismatching");	
		}
			
		

		
		
	}

}
