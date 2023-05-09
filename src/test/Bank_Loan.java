package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bank_Loan {

	@AfterTest
	public void zap_Loan()
	{
		System.out.println("zap_Loan");
	}
	@Test(groups= {"Smoke"})
	public void studyLoan()
	{
		System.out.println("StudyLoan");
	}
	@Test(enabled=false)

	public void crop_Loan()
	{
		System.out.println("crop_Loan");
	}
	@BeforeTest
	public void map_Loan()
	{
		System.out.println("Map_Loan");
	}
	@Test(dependsOnMethods= {"crop_Take"})

	public void crop_Bam()
	{
		System.out.println("crop_Bam");
	}
	@Test

	public void crop_Take()
	{
		System.out.println("crop_Take");
	}

	
}
