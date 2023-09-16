package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WithOutWebElementDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		withOutWebElement();
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
	
	private static void withOutWebElement()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser2");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser3");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser4");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser12345");
			Thread.sleep(1000);
			String content=oBrowser.findElement(By.id("username")).getAttribute("value");
			System.out.println(content);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
