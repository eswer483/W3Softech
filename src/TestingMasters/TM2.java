package TestingMasters;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TM2 {
	@BeforeSuite
	public void BS(){
		System.out.println("BeforeSuite is executed");
	}
	@BeforeTest
	public void BT(){
		System.out.println("BeforeTest is executed");
	}

	@Test()
	public void TC04(){
	System.out.println("TC04 executed");
	}
}
