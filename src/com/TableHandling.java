package com;

import static org.testng.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class TableHandling extends Base{

	@Test()
	public void table() throws InterruptedException, IOException {
		String expected ="Financial Center";
		driver.get("https://www.toolsqa.com/automation-practice-table/#");
		WebElement tbody=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody"));
//		System.out.println(tbody.getText());
		List<WebElement> trows=tbody.findElements(By.tagName("tr"));
//		System.out.println(trows.size());
		WebElement expectedRow = null;
		for (WebElement trow:trows)
		{
			WebElement tcol = trow.findElement(By.tagName("th"));
//			System.out.println(trow.getText());
//			System.out.println(tcol.getText());
			if(expected.equalsIgnoreCase(tcol.getText()))
					{
				expectedRow = trow;
				break;
					}
		}assertNotNull(expectedRow);
//		System.out.println(expectedRow.getText());
		List<WebElement> trcolms=expectedRow.findElements(By.tagName("td"));
		System.out.println(trcolms.size());
		WebElement details=trcolms.get(trcolms.size()-1).findElement(By.tagName("a"));
		System.out.println(details.getText());
		JavascriptExecutor js =(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", details);
		Thread.sleep(3000);
		TakesScreenshot scr =((TakesScreenshot)driver);
		File src = scr.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:/Users/DELL/Desktop/table.png");
		Files.copy(src, dest);
	}	
}	
	
	