package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HrmTableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selinium lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b"))).perform();
		act.moveToElement(driver.findElement(By.linkText("Employee List"))).click().pause(2).build().perform();
		WebElement body=driver.findElement(By.xpath("//*[@class='table hover']/tbody"));
		System.out.println(body.getText());
		

	

	}

}
