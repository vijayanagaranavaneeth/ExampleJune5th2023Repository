package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absoluteCssSelector();
	//	relativeCSSUsingTagName();
	//	relativeCSSUsingTagNameWithIdAttributeValue();
	//	relativeCSSUsingIdAttributeValue();
	//	relativeCSSUsingTagNameWithClassAttributeValue();
	//	relativeCSSUsingClassAttributeValue();
	//	relativeCSSUsingAttributeNameValueCombination();
	//	relativeCSSUsingMultipleAttributeNameValueCombination();
	//	relativeCSSUsingPartialMatchingOfAttributeValue();
	//	relativeCSSUsingParentElementReference();
	//	relativeCSSUsingNthChildConcept();
	//	relativeCSSUsingSiblings();
	//	relativeCSSUsingTagNameWithAttributeName();
	//	relativeCSSUsingTagNameWithAttributeName_01();
	//	relativeCSSUsingTagNameWithAttributeName_02();
		relativeCSSUsingTagNameWithAttributeName_03();
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

	/**
	 * absolute css path to identify the element
	 */
	private static void absoluteCssSelector()
	{
		oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("DemoUser1");
	}
	
	/**
	 * case 1: Identify the Element using TagName Alone
	 * Syntax: <tagName>
	 */
	private static void relativeCSSUsingTagName()
	{
		oBrowser.findElement(By.cssSelector("input")).sendKeys("DemoUser1");
	}
	
	/**
	 * case 2: Identify the Element using TagName with id attribute value
	 * Syntax: <tagName>#<id attribute value>
	 */
	private static void relativeCSSUsingTagNameWithIdAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("DemoPasword1");
	}
	
	/**
	 * case 3: Identify the Element using id attribute value
	 * Syntax: #<id attribute value>
	 */
	private static void relativeCSSUsingIdAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("DemoPasword2");
	}
	
	/**
	 * case 4: Identify the Element using TagName with class attribute value
	 * Syntax: <tagName>.<class attribute value>
	 */
	private static void relativeCSSUsingTagNameWithClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input.pass1word1")).sendKeys("DemoPasword3");
	}
	
	/**
	 * case 5: Identify the Element using class attribute value
	 * Syntax: .<class attribute value>
	 */
	private static void relativeCSSUsingClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector(".pass1word1")).sendKeys("DemoPasword4");
	}
	
	/**
	 * case 6: Identify the Element using tagName with attribute name and value combination
	 * Syntax:  <tagName>[attributeName=attributeValue]
	 */
	private static void relativeCSSUsingAttributeNameValueCombination()
	{
		oBrowser.findElement(By.cssSelector("input[value='Submit']")).click();
	}
	
	/**
	 * case 7: Identify the Element using tagName with multiple
	 *         attribute name and value combination
	 * Syntax:  <tagName>[attributeName=attributeValue][attributeName=attributeValue]
	 */
	private static void relativeCSSUsingMultipleAttributeNameValueCombination()
	{
		oBrowser.findElement(By.cssSelector("input[value='Submit'][type='button']")).click();
	}
	
	/**
	 * case 8: Identify the Element using based on Partial Matching of attribute value
	 * Syntax:  
	 * <tagName>[attributeName ^= attributeValue]
	 * <tagName>[attributeName $= attributeValue]
	 * <tagName>[attributeName *= attributeValue]
	 */
	private static void relativeCSSUsingPartialMatchingOfAttributeValue()
	{
	//	oBrowser.findElement(By.cssSelector("input[id ^= 'btn1']")).click();
		oBrowser.findElement(By.cssSelector("input[id *= 'submit']")).click();
	}
	
	/**
	 * case 9: Identify the Element based on Parent Element reference
	 * Syntax: <parentElement> > <childElement>
	 */
	private static void relativeCSSUsingParentElementReference()
	{
		oBrowser.findElement(By.cssSelector("form#frm2 > input")).click();
	}
	
	/**
	 * case 10: Identify the Element based on nth-child concept
	 * Syntax: <parentElement> > nth-child(number)
	 */
	private static void relativeCSSUsingNthChildConcept()
	{
	//	oBrowser.findElement(By.cssSelector("form#frm3 > :nth-child(3)")).sendKeys("DemoUser3");
	//	oBrowser.findElement(By.cssSelector("form#frm3 > :nth-child(5)")).sendKeys("DemoUser5");
		oBrowser.findElement(By.cssSelector("form#frm3 > :nth-child(10)")).sendKeys("DemoUser10");
	}
	
	/**
	 * case 11: Identify the Element based on sibling approach
	 * Syntax: <parentElement> > <tagName> + <tagName> + <tagName>
	 */
	private static void relativeCSSUsingSiblings()
	{
		oBrowser.findElement(By.cssSelector("form#frm3 > input + input + input + input")).sendKeys("DemoUser4");
	}
	
	/**
	 * case 12: Identify the Element based on tagName with attributeName
	 * Syntax: <tagName>[attributeName]
	 */
	private static void relativeCSSUsingTagNameWithAttributeName()
	{
		//Find Number of Links in Application
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		System.out.println("# of Links are :"+olinks.size());
	}
	
	private static void relativeCSSUsingTagNameWithAttributeName_01()
	{
		//Display Link Names in Application
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String linktext=link.getText();
			System.out.println(linktext);
		}
	}
	
	private static void relativeCSSUsingTagNameWithAttributeName_02()
	{
		//Based on ends with identify the Element
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String linktext=link.getText();
			if(linktext.endsWith("Testing"))
			{
				link.click();
				break;
			}
			
		}
	}
	
	private static void relativeCSSUsingTagNameWithAttributeName_03()
	{
		// org.openqa.selenium.StaleElementReferenceException: stale element reference: 
		// stale element not found
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String linktext=link.getText();
			if(linktext.endsWith("Testing"))
			{
				link.click();
			}
			
		}
	}
}
