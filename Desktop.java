package org.system;

public class Desktop extends Computer {

	public void desktopSize()
	{
	System.out.println("The Desktop Size is 16.5");
	}
	
	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.desktopSize();
		obj.computerModel();
	}
	

}
