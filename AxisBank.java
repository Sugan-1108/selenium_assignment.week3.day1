package assignments.week3.day1;

public class AxisBank extends BankInfo{

	public void deposit() 
	{
		System.out.println("Axis Bank Deposit: 60,000");

	}
	
	public static void main(String[] args) {
		
		AxisBank obj = new AxisBank();
		obj.fixed();
		obj.saving();
		obj.deposit();

	}

}
