package test;

import org.testng.annotations.Test;

public class Shiv {

	@Test
	public void dem()
	{
		System.out.println("Hello");
	}
	@Test(groups= {"Smoke"})
	public void mobileLoan()
	{
		System.out.println("mobileLoan");
	}
	@Test
	public void lapyLoan()
	{
		System.out.println("Loptop");
	}
}
