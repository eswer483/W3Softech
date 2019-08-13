package TestingMasters;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TM1 {
	@BeforeClass
	public void BC(){
		System.out.println("BeforeClass is executed");
	}
	@AfterClass
	public void AC(){
		System.out.println("AfterClass is executed");
	}
	//It is pre condition for all test cases(it is not manadatory)
	@BeforeMethod
	public void BM(){
		System.out.println("BeforeMethod executed");
	}
	
	@AfterMethod
	public void AM(){
		System.out.println("AfterMethod executed");
	}

	
	@Test(priority =0,enabled =false)
	public void TC01(){
		System.out.println("TC01 executed");
	}
	
	@Test(priority =1)
	public void TC02(){
	System.out.println("TC02 executed");
	}
	
	@Test(priority =2)
	public void TC03(){
	System.out.println("TC03 executed");
}
}
