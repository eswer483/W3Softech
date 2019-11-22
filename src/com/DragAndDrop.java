package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop extends Base{
  @Test(enabled=true)
	  public void MouseHoverAction() throws InterruptedException {
		  driver.manage().window().maximize();
		  driver.get("https://jqueryui.com/");
		  Actions act = new Actions(driver);
		  driver.findElement(By.linkText("Draggable")).click();
		  //switch to frame
		  driver.switchTo().frame(0);
		  act.dragAndDropBy(driver.findElement(By.id("draggable")), 195, 125).build().perform();
		  //switch out from frame
		  driver.switchTo().defaultContent();
		  driver.findElement(By.xpath("//*[@id='sidebar']/aside/ul/li[2]/a")).click();
		  driver.switchTo().frame(0);
		  act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
		  driver.switchTo().defaultContent();
		  act.moveToElement(driver.findElement(By.linkText("Support"))).perform();
		  act.moveToElement(driver.findElement(By.linkText("Forums"))).click().perform();		  
	  }
  /*
  @Test(priority=1)
  public void MouseHoverAction() throws InterruptedException {
	  driver.manage().window().maximize();
	  driver.get("https://jqueryui.com/");
	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.linkText("Support"))).perform();
	  act.moveToElement(driver.findElement(By.linkText("Forums"))).click().perform();
  
  @Test(priority=2)
  public void Drag() {
	  driver.manage().window().maximize();
	  driver.get("https://jqueryui.com/");
	  driver.findElement(By.linkText("Draggable")).click();
	  Actions act= new Actions(driver);
	  driver.switchTo().frame(0);
	  act.dragAndDropBy(driver.findElement(By.id("draggable")), 195, 125).build().perform();
  }
  @Test(priority=3)
  public void DragAndDrop1() {
	  driver.manage().window().maximize();
	  driver.get("https://jqueryui.com/");
	  driver.findElement(By.linkText("Droppable")).click();
	  Actions act= new Actions(driver);
	  driver.switchTo().frame(0);
	  act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
  }
  @Test(priority=4)
  public void Ressizable() throws InterruptedException {
	  driver.manage().window().maximize();
	  driver.get("https://jqueryui.com/");
	  driver.findElement(By.linkText("Resizable")).click();
	  Actions act = new Actions(driver);
	  driver.switchTo().frame(0);
	  act.dragAndDropBy(driver.findElement(By.xpath("//*[@id='resizable']/div[3]")), 405, 110).build().perform();
	  Thread.sleep(2000);
  }
/* @Test()(priority=5)
  public void Selectable() throws InterruptedException{
	  driver.manage().window().maximize();
	  driver.get("https://jqueryui.com/");
	  driver.findElement(By.linkText("Selectable")).click();
	  Actions act = new Actions(driver);
	  driver.switchTo().frame(0);
	  List<WebElement> b = driver.findElements(By.xpath("//*[@id='selectable']/li"));
	  int i =0;
	  for (WebElement a : b)
	  {
		  if(i<b.size())
		  {
			  act.clickAndHold(a).perform();
		  }
	  }
  }
  @Test(priority=6)
  public void Sortable(){
	  driver.manage().window().maximize();
	  driver.get("https://jqueryui.com/");
	  driver.findElement(By.linkText("Sortable")).click();
	  Actions act = new Actions(driver);
	  driver.switchTo().frame(0);
//	  WebElement a =driver.findElement(By.xpath("//*[@id='sortable']/li[2]"));
//	  WebElement b=driver.findElement(By.xpath("//*[@id='sortable']/li[7]"));
//	  act.click(a).clickAndHold().moveToElement(b).moveByOffset(0, 2).build().perform();
	  List<WebElement> sort=driver.findElements(By.xpath("//*[@id='sortable']/li"));
	  WebElement a=sort.get(0);
	  WebElement b=sort.get(4);
	  WebElement c=sort.get(2);
	  WebElement d=sort.get(6);
	  act.click(a).clickAndHold().moveToElement(b).click(c).clickAndHold().moveToElement(d).moveByOffset(0,10 ).build().perform(); 	  
  }*/
 }
