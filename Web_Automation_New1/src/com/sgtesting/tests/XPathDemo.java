package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absoluteXPath();
	//	relativeXPathUsingTagName();
	//	relativeXPathUsingTagNameWithIndex();
	//	relativeXPathUsingTagNameWithAttributeNameAndValue();
	//	relativeXPathUsingAttributeNameAndValue();
	//	relativeXPathUsingAttributeValueAlone();
	//	relativeXPathUsingTagNameWithMultipleAttributeNameAndValue();
	//	relativeXPathUsingTagNameWithMultipleAttributeNameAndValueusingOROperator();
	//	relativeXPathUsingTagNameWithMultipleAttributeNameAndValueusingAndOperator();
	//	relativeXPathUsingTagNameWithPartialMatchingAttributeValue();
	//	relativeXPathUsingTextContent();
	//	relativeXPathUsingPartialMatchingOfTextContent();
	//	relativeXPathUsingTagNameWithAttributeName();
	//	relativeXPathUsingTagNameWithAttributeName_01();
	//	relativeXPathUsingTagNameWithAttributeName_02();
		relativeXPathUsingTagNameWithAttributeName_03();
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
	
	private static void absoluteXPath()
	{
		try
		{
			oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("DemoUser1");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Case 1: identify the Element using tagName
	 * Syntax: //<tagName>
	 */
	private static void relativeXPathUsingTagName()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("DemoUser2");
	}
	
	/**
	 * Case 2: identify the Element using tagName with index
	 * Syntax: //<tagName>[index]
	 */
	private static void relativeXPathUsingTagNameWithIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("DemoUser3");
	}
	
	/**
	 * Case 3: Identify the Element using tagName with attributeName and attributeValue
	 * Syntax: <tagName>[@attributeName='AttributeValue']
	 */
	private static void relativeXPathUsingTagNameWithAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();
	}
	
	/**
	 * Case 4: Identify the Element using irrespective of tagName attributeName and attributeValue
	 * Syntax: *[@attributeName='AttributeValue']
	 */
	private static void relativeXPathUsingAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//*[@value='Submit']")).click();
	}
	
	/**
	 * Case 5: Identify the Element using irrespective of tagName 
	 *         irrespective of attribute Name only using attributeValue
	 * Syntax: *[@*='AttributeValue']
	 */
	private static void relativeXPathUsingAttributeValueAlone()
	{
		oBrowser.findElement(By.xpath("//*[@*='Submit']")).click();
	}
	
	/**
	 * Case 6: Identify the Element using tagName with 
	 *         multiple attributeName and attributeValue
	 * Syntax: <tagName>[@attributeName='AttributeValue'][@attributeName='AttributeValue']
	 */
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//input[@type='button'][@value='Submit']")).click();
	}
	
	/**
	 * Case 7: Identify the Element using tagName with 
	 *         multiple attributeName and attributeValue combination using or operator
	 * Syntax: <tagName>[@attributeName='AttributeValue' or @attributeName='AttributeValue']
	 */
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameAndValueusingOROperator()
	{
		oBrowser.findElement(By.xpath("//input[@type='button' or @value='Submit']")).click();
	}
	
	/**
	 * Case 8: Identify the Element using tagName with 
	 *         multiple attributeName and attributeValue combination using and operator
	 * Syntax: <tagName>[@attributeName='AttributeValue' and @attributeName='AttributeValue']
	 */
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameAndValueusingAndOperator()
	{
		oBrowser.findElement(By.xpath("//input[@type='button' and @value='Submit']")).click();
	}
	
	/**
	 * Case 9: Identify the Element using tagName with attributeName and 
	 *         partial matching of attributeValue
	 * Syntax: 
	 * 		starts-with(@attributeName,'partial attribute value')
	 * 		ends-with(@attributeName,'partial attribute value')
	 * 		contains(@attributeName,'partial attribute value')
	 * 
	 * 		<tagName>[starts-with(@attributeName,'partial attribute value')]
	 * 		<tagName>[ends-with(@attributeName,'partial attribute value')]
	 * 		<tagName>[contains(@attributeName,'partial attribute value')]
	 */
	private static void relativeXPathUsingTagNameWithPartialMatchingAttributeValue()
	{
	//	oBrowser.findElement(By.xpath("//input[starts-with(@id,'btn1')]")).click();
		oBrowser.findElement(By.xpath("//input[contains(@id,'submit1')]")).click();
	}
	
	/**
	 * Case 10: Identify the Element using Text Content
	 * Syntax: <tagName>[text()='text content']
	 */
	private static void relativeXPathUsingTextContent()
	{
		oBrowser.findElement(By.xpath("//a[text()='S G Software Testing']")).click();
	}
	
	
	/**
	 * Case 11: Identify the Element using Partial Matching of Text Content
	 * 			starts-with(text(),'partial text value')
	 * 			ends-with(text(),'partial text value')
	 * 			contains(text(),'partial text value')
	 * 
	 * Syntax: 
	 * 
	 * 			<tagName>[starts-with(text(),'partial text value')]
	 * 			<tagName>[ends-with(text(),'partial text value')]
	 * 			<tagName>[contains(text(),'partial text value')]
	 */
	private static void relativeXPathUsingPartialMatchingOfTextContent()
	{
		oBrowser.findElement(By.xpath("//a[starts-with(text(),'S G')]")).click();
	}
	
	/**
	 * Case 12: Identify the Element using tagName with attributeName
	 * Syntax: <tagName>[@attributeName]
	 */
	private static void relativeXPathUsingTagNameWithAttributeName()
	{
		// Display Number of Links in a Web Page
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		System.out.println("# of Links in a Web Page :"+olinks.size());
	}
	
	private static void relativeXPathUsingTagNameWithAttributeName_01()
	{
		// Display Links Names in a Web Page
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String linkname=link.getText();
			System.out.println(linkname);
		}
	}
	
	private static void relativeXPathUsingTagNameWithAttributeName_02()
	{
		// In Partial Matching, ends-with does not work, even by using ends-with 
		// of text content identify the Element.
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String linkname=link.getText();
			if(linkname.endsWith("Testing"))
			{
				link.click();
				break;
			}
			
		}
	}
	
	private static void relativeXPathUsingTagNameWithAttributeName_03()
	{
		// org.openqa.selenium.StaleElementReferenceException: stale element reference: 
		// stale element not found
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String linkname=link.getText();
			if(linkname.startsWith("POI"))
			{
				link.click();
			}
			
		}
	}
}
