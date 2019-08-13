package com;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Base {
	public static WebDriver driver;
 
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selinium lib\\chromedriver.exe");
	   driver = new ChromeDriver();
  }
/*  @BeforeMethod
  public void Url(){
	  driver.get("https://jqueryui.com/");
  }
  
  

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }*/
}
