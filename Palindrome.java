package assignments.week3.day1;

public class Palindrome {

	public static void main(String[] args) {
		String value = "madam";
		String revValue = "";
		int length = value.length();
		
		for (int i = length-1; i >= 0; i--) 
		{
			revValue = revValue + value.charAt(i);
		}

		if(value .equals(revValue))
		{
			System.out.println("Given Value is Palindrome");
		}
		else
		{
			System.out.println("Given Value is not Palindrome");
		}
		
	}

}
