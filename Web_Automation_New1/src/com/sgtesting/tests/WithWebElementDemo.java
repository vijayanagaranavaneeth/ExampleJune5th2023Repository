package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WithWebElementDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		withWebElement();
	}
	
	private static void launchBrowser()
	{
		try
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			oBrowser=new ChromeDriver(options);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void withWebElement()
	{
		try
		{
			WebElement oUserName=oBrowser.findElement(By.id("username"));
			oUserName.sendKeys("DemoUser1");
			Thread.sleep(1000);
			oUserName.clear();
			Thread.sleep(1000);
			oUserName.sendKeys("DemoUser2");
			Thread.sleep(1000);
			oUserName.clear();
			Thread.sleep(1000);
			oUserName.sendKeys("DemoUser3");
			Thread.sleep(1000);
			oUserName.clear();
			Thread.sleep(1000);
			oUserName.sendKeys("DemoUser4");
			Thread.sleep(1000);
			oUserName.clear();
			Thread.sleep(1000);
			oUserName.sendKeys("DemoUser12345");
			Thread.sleep(1000);
			String content=oUserName.getAttribute("value");
			System.out.println(content);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
