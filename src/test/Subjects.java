package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Subjects {

	@BeforeClass
	public void demm()
	{
		System.out.println("Class level first");
	}
	@AfterClass
	public void demm2()
	{
		System.out.println("Class level last");
	}
	@Test(groups= {"Smoke"})
	public void java()
	{
		System.out.println("Java Tutorial");
	}
	@BeforeMethod
	public void python()
	{
		System.out.println("Python Tutorial");
	}
	@Test
	public void sql()
	{
		System.out.println("SQL Tutorial");
	}@AfterSuite
	public void html()
	{
		System.out.println("HTML Tutorial");
	}
}
