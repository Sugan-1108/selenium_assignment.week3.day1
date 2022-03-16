package assignments.week3.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] strArray = test.split(" ");
		for (int i = 0; i < strArray.length; i++) 
		{
		if (i%2 != 0)
		{
			String reverse="";
			char[] strArray1 = strArray[i].toCharArray();
			for (int j = strArray1.length-1 ; j >= 0; j--) 
			{
				reverse = reverse + strArray1[j];
				
			}
			
			System.out.println(reverse +"");
		}
		else
			{
				System.out.println(strArray[i] +"");
			}
			
		

		}
	}

}
