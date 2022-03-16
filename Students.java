package assignments.week3.day1;

public class Students {

	public void getStudentInfo(int id)
	{
		System.out.println("Student Id:" +id);

	}

	public void getStudentInfo(int id, String name)
	{
		System.out.println("Student ID: " +id );
		System.out.println("Student Name: " +name);
		
	}
	public void getStudentInfo(String email, long phoneNumber)
	{
		System.out.println("Email ID: " +email);
		System.out.println("Phone Number: " +phoneNumber);
	}
	
	
	public static void main(String[] args) {
		
		Students obj = new Students();
		obj.getStudentInfo(308967);
		obj.getStudentInfo(308967, "Ram");
		obj.getStudentInfo("test@gmail.com", 8907867895l);

	}

}
