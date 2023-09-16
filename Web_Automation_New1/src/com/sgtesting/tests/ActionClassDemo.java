package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		mouseMovements();
	}
	
	private static void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://www.flipkart.com/");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void mouseMovements()
	{
		try
		{
			oBrowser.findElement(By.xpath("//button[text()='✕']")).click();
			Thread.sleep(5000);
			WebElement oEletronics=oBrowser.findElement(By.xpath("//div[text()='Electronics']"));
			
			Actions oMouse=new Actions(oBrowser);
			oMouse.moveToElement(oEletronics).build().perform();
			Thread.sleep(2000);
			WebElement computer=oBrowser.findElement(By.linkText("Computer Peripherals"));
			oMouse.moveToElement(computer).build().perform();
			Thread.sleep(2000);
			WebElement printers=oBrowser.findElement(By.linkText("Printers"));
			oMouse.click(printers).build().perform();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
