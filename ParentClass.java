package testng_Package;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ParentClass 
{
	public void doThis() 
	{
		System.out.println("Run this..");
	}
	
	@BeforeMethod
	public void beforeRun()
	{
		System.out.println("Run me first!");
	}
	
	@AfterMethod
	public void afterRun()
	{
		System.out.println("Run me last.");
	}
}
