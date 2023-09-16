package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	enterSalryForPersonNameSachinTendulkar();
	//	enterSalryForPersonWhoIsNextToSachinTendulkar();
	//	makeStatusAsActiveForIndianFreedomFighter();
	//	makeStatusAsActiveForPersonWhoIsPreviousToRahulDravid();
	//	enterSalryFor4thRecordBasedOnTableTag();
		getTableIdAttributeBasedOnSalaryTextFieldOfSachinTendulakrRecord();
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
			oBrowser.get("file:///D:/HTML/WebTableHTML.html");
			Thread.sleep(3000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * case1: following-sibling
	 * Description: For Person Name Sachin Tendulkar, Enter the Salary 25000
	 */
	private static void enterSalryForPersonNameSachinTendulkar()
	{
	//	oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td/following-sibling::td/following-sibling::td/input")).sendKeys("25000");
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("25000");
	}
	
	/**
	 * Case 2: following
	 * Description: Enter the Salary for a Person Who is Next to Sachin Tendulkar
	 */
	private static void enterSalryForPersonWhoIsNextToSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following::tr[1]/td[6]/input")).sendKeys("20000");
	}
	
	/**
	 * Case 3: preceding-sibling
	 * Description: Make the Status as Active For Indian Freedom Fighter
	 */
	private static void makeStatusAsActiveForIndianFreedomFighter()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
	}
	
	/**
	 * Case 4: preceding
	 * Description: Make the Status as Active For Person Who is Previous to Rahul Dravid
	 */
	private static void makeStatusAsActiveForPersonWhoIsPreviousToRahulDravid()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/preceding::tr[1]/td[1]/input")).click();
	}
	
	/**
	 * Case 5: descendant
	 * Description: Based on Table tag, its 4th Record, Enter the Salary
	 * 
	 */
	private static void enterSalryFor4thRecordBasedOnTableTag()
	{
		oBrowser.findElement(By.xpath("//table/descendant::tr[4]/td[6]/input")).sendKeys("22000");
	}
	
	/**
	 * Case 6: ancestor
	 * Description: Based on Salary Text Field of Sachin Tendulakr Record, Get the Table id attribute
	 */
	private static void getTableIdAttributeBasedOnSalaryTextFieldOfSachinTendulakrRecord()
	{
		String id_value=oBrowser.findElement(By.xpath("//input[@id='edit4']/ancestor::td/ancestor::tr/ancestor::table")).getAttribute("id");
		System.out.println("id attribute value of table :"+id_value);
	}
}
