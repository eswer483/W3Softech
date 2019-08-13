package com;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selinium lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("india");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		List<WebElement> suggest=driver.findElements(By.xpath("//*[@class='UUbT9']/div/ul/li"));		
		System.out.println(suggest.size());
		for(WebElement target : suggest)
		{
			if("india post".equalsIgnoreCase(target.getText()))
			{
				target.click();
				break;
			}
			else
			{
				System.out.println("text is not matched");
			}
		}
		driver.close();
	

	}

}
