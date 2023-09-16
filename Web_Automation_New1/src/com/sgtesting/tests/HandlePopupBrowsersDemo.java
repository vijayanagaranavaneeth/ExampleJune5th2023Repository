package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopupBrowsersDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		handlePopups();
	}

	private static void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
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
	
	private static void handlePopups()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.linkText("actiTIME Inc."));
			System.out.println("Before Click on the Link, # of Popups :"+getPopupsCount());
			oEle.click();
			Thread.sleep(2000);
			System.out.println("After Click on the Link, # of Popups :"+getPopupsCount());
			if(getPopupsCount() > 0)
			{
				popupsDetails();
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static int getPopupsCount()
	{
		int count=0;
		count=oBrowser.getWindowHandles().size()-1;
		return count;
	}
	
	private static void popupsDetails()
	{
		String parentBrowser;
		try
		{
			parentBrowser=oBrowser.getWindowHandle();
			System.out.println("Parent Browser :"+parentBrowser);
			
			Object popups[]=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<popups.length;i++)
			{
				String childBrowser=popups[i].toString();
				System.out.println("Child Browser :"+childBrowser);
				oBrowser.switchTo().window(childBrowser);
				Thread.sleep(2000);
				String url=oBrowser.getCurrentUrl();
				System.out.println("URL:"+url);
				String title=oBrowser.getTitle();
				System.out.println("Title :"+title);
				oBrowser.findElement(By.linkText("Try Free")).click();
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
