package com;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

public class Imageupload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selinium lib\\newsekinium\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		   driver.findElement(By.id("identifierId")).sendKeys("eswerbhavani@gmail.com");
		   driver.findElement(By.id("identifierNext")).click();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver.findElement(By.xpath("//*[@name='password']")).sendKeys("pammabhagavan");
		   driver.findElement(By.id("passwordNext")).click();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver.findElement(By.xpath("//*[@class='gb_B gb_Da gb_g']")).click();
		   driver.findElement(By.xpath("//*[@class='gb_Ma']")).click();
		   Screen s = new Screen();
		   s.click("se.PNG");
		   Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\1.exe");
		   Thread.sleep(30000);
		   s.click("dismiss.PNG");
		   s.click("SAP.PNG");
		   /*Robot r = new Robot();
		   r.keyPress(KeyEvent.VK_TAB);
		   r.keyRelease(KeyEvent.VK_TAB);
		   r.keyPress(KeyEvent.VK_TAB);
		   r.keyRelease(KeyEvent.VK_TAB);
		   r.keyPress(KeyEvent.VK_TAB);
		   r.keyRelease(KeyEvent.VK_TAB);
		   r.keyPress(KeyEvent.VK_TAB);
		   r.keyRelease(KeyEvent.VK_TAB);
		   r.keyPress(KeyEvent.VK_TAB);
		   r.keyRelease(KeyEvent.VK_TAB);
		   r.keyPress(KeyEvent.VK_TAB);
		   r.keyRelease(KeyEvent.VK_TAB);
		   r.keyPress(KeyEvent.VK_TAB);
		   r.keyRelease(KeyEvent.VK_TAB);
		   r.keyPress(KeyEvent.VK_TAB);
		   r.keyRelease(KeyEvent.VK_TAB);
		   Thread.sleep(2000);
		   */
		   
	
		   /*driver.findElement(By.xpath("//*[@class='gb_C gb_Ia gb_g']")).click();
		   driver.findElement(By.xpath("//*[@class='gb_Ca gbip']")).click();
		   driver.switchTo().frame(5);
		   System.out.println(driver.getTitle());
		   driver.findElement(By.id("//*[@id=':e.select-files-button']/div")).click();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver.findElement(By.cssSelector("bottom: auto; right: auto; width: auto; height: 100%; min-height: 613px;")).click();
*/
	}

}
