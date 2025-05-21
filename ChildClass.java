package testng_Package;

import org.testng.annotations.Test;

public class ChildClass extends ParentClass 
{
	
	
	@Test
	public void testRun()
	{
		//ParentClass ps = new ParentClass(); //Create an object and call the method from another class
		//ps.doThis();
		
		doThis(); //You need to use "extends" to call the method from another class
	}
}
