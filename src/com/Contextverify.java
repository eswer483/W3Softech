package com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Contextverify extends Base{
  @Test
  public void f() {
	  System.getProperty("https://retail.onlinesbi.com/retail/login.htm");
	  String actual ="This function is not allowed here.";
	  driver.manage().window().maximize();
	  driver.get("https://retail.onlinesbi.com/retail/login.htm");
	  driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
	  WebElement a =driver.findElement(By.id("username"));
	  Actions act =new Actions(driver);
	  act.contextClick(a).perform();	  
	  Alert al =driver.switchTo().alert();
	  Assert.assertEquals(actual, al.getText());
	  if(actual.equals(al.getText()))
	  {
//	  System.out.println(al.getText());
	  al.accept();
	  }
	  else 
	  {
		  System.out.println("sorry alert cant handle on this page");
	  }
  }
}
