package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	getTitle();
	//	getURL();
	//	getLinksCount();
	//	enterDataInTextField1();
	//	enterDataInTextField2();
	//	selectCheckBox1();
	//	selectCheckBox2();
	//	selectRadioButton1();
	//	selectRadioButton2();
	//	clickOnButton1();
		clickOnButton2();
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
			oBrowser.get("file:///D:/HTML/Sample.html");
			Thread.sleep(3000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void getTitle()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			String val=(String) js.executeScript("var kk=document.title;return kk;");
			System.out.println("title of the Web Page :"+val);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void getURL()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			String val=(String) js.executeScript("var kk=document.URL;return kk;");
			System.out.println("URL of the Web Page :"+val);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void getLinksCount()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		long links=(long) js.executeScript("var kk=document.getElementsByTagName('A');return kk.length;");
		System.out.println("# of Links are :"+links);
	}
	
	private static void enterDataInTextField1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('uid1user1name1').value='DemoUser1';");
	}
	
	private static void enterDataInTextField2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.id("pwd1pass1word1"));
		js.executeScript("arguments[0].value='DemoUser2';", oEle);
	}
	
	private static void selectCheckBox1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('chk1windows').click();");
	}
	
	private static void selectCheckBox2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.id("chk2linux"));
		js.executeScript("arguments[0].click();",oEle);
	}
	
	private static void selectRadioButton1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('rad1chrome').click();");
	}
	
	private static void selectRadioButton2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.id("rad2firefox"));
		js.executeScript("arguments[0].click();",oEle);
	}
	
	private static void clickOnButton1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('btn1submit1button1').click();");
	}
	
	private static void clickOnButton2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.id("btn1submit1button1"));
		js.executeScript("arguments[0].click();",oEle);
	}
}
