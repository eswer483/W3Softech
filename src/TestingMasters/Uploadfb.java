package TestingMasters;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Uploadfb {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
//		Map<String, Object> prefs = new HashMap<String, Object>();
        
        // Set the notification setting it will override the default setting
//prefs.put("profile.default_content_setting_values.notifications", 2);

        // Create object of ChromeOption class
//ChromeOptions options = new ChromeOptions();

        // Set the experimental option
//options.setExperimentalOption("prefs", prefs);

        // pass the options object in Chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selinium lib\\newsekinium\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notification");
		   WebDriver driver = new ChromeDriver(opt);
//		   Screen s = new Screen();
		   driver.get("https://www.facebook.com/");
		   driver.findElement(By.id("email")).sendKeys("bhavanieswer@yahoo.com");
		   driver.findElement(By.id("pass")).sendKeys("Pammabhagavan");
		   driver.findElement(By.id("loginbutton")).click();
//		   s.click("Allow.PNG");
		  /* Alert alt = driver.switchTo().alert();
	        alt.accept();*/
		  // driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]/span[1]")).click();
		   
		  /* options.addExtensions(new File("Path to CRX File"));
		   DesiredCapabilities capabilities = new DesiredCapabilities();
		   capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		   ChromeDriver drive = new ChromeDriver(capabilities); */

	}

}
