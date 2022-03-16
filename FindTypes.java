package assignments.week3.day1;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] charTest = test.toCharArray();
		for (int i = 0; i < charTest.length; i++) 
		{
			if(Character.isLetter(charTest[i]))
			{
				letter++;
			}	
			 if(Character.isDigit(charTest[i]))
			{
				num++;
			}
			 if(Character.isSpaceChar(charTest[i]))
			{
				space++;
			}
			else
			{
				specialChar++;
			}
			
		}
		
		
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}	
