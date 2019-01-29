package Rajesh;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Git {

	
	@Test
	public void test()
	{
		System.out.println("Hello jenkins");
		System.out.println("It's working fine");
	}
	@BeforeTest 
	public void start()
	{
		System.out.println("hello innominds");
	}
	
	
}
