package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Hoveractions extends Base{
  @Test
  public void f() {
	  driver.manage().window().maximize();
	  driver.get("https://jquery.com");
	  Actions a= new Actions(driver);
	  a.moveToElement(driver.findElement(By.linkText("Support"))).build().perform();
	  
	  //performing mouseoveraction by clicking forms
	  a.moveToElement(driver.findElement(By.xpath("//*[@id='global-nav']/nav/div/ul[2]/li[4]/ul/li[3]/a"))).click().pause(20).build().perform();
	  
	  //performing explicit wait to find element
/*    WebElement form=driver.findElement(By.linkText("Forums"));
      WebDriverWait wait= new WebDriverWait(driver, 2);
      wait.until(ExpectedConditions.visibilityOf(form));
      form.click();*/
	  
  }
}
