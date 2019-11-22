package framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;

public class Keydriven {

	public static void main(String[] args) throws JXLException, IOException {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selinium lib\\newsekinium\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				FileInputStream file = new FileInputStream("F:\\adactin credentails.xls");
				Workbook wb =Workbook.getWorkbook(file);
				Sheet sheet =wb.getSheet("Sheet1");
				int rows = sheet.getRows();
			//	int columns = sheet.getColumns();
				for(int i=1;i<=rows-1;i++)
				{
					String operations = sheet.getCell(0, i).getContents();
					String element = sheet.getCell(1, i).getContents();
					String value = sheet.getCell(2, i).getContents();
					
					switch(operations)
					{
					case "get":
						driver.get(value);
						break;
					case "enter":
						driver.findElement(By.id(element)).sendKeys(value);
						break;
					case "click":
						driver.findElement(By.id(element)).click();
						break;
					case "dropdown":
						Select s= new Select(driver.findElement(By.id("location")));
						s.selectByValue(value);
						break;
						
						
					}
					}
				}
				

	}
