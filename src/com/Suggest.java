package com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selinium lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/");
		driver.findElement(By.id("fromPlaceName")).sendKeys("hyd");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		List<WebElement> suggest=driver.findElements(By.className("ui-menu-item"));
		for(WebElement target:suggest)
		{
			System.out.println(target.getText());
			if("HYDERABAD-AIRPORT-RGIA-PICKUP POINT-D".equalsIgnoreCase(target.getText()))
			{
				target.click();
			}
			else
			{
				System.out.println("target not found");
			}
		}

	}

}
