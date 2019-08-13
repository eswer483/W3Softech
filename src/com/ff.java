package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ff {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\selinium lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(1000);
		driver.get("https://www.youtube.com/results?search_query=testng+framework+in+selenium");

	}

}
