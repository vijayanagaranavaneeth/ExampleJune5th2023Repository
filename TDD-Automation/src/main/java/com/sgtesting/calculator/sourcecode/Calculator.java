package com.sgtesting.calculator.sourcecode;

public class Calculator {
	/*
	 * Method Name : addition
	 */
	public int addition(int num1,int num2)
	{
		int result=0;
		try
		{
			result=(num1+num2);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}

	/*
	 * Method Name : addition
	 */
	public int addition(int numbers[])
	{
		int result=0;
		try
		{
			for(int i=0;i<numbers.length;i++)
			{
				result=result+numbers[i];
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}
	
	/*
	 * Method Name : Subtraction
	 */
	public int Subtraction(int num1,int num2)
	{
		int result=0;
		try
		{
			result=(num1-num2);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}
	
	/*
	 * Method Name : division
	 */
	public int division(int num1,int num2)
	{
		int result=0;
		try
		{
			result=(num1/num2);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}
	
	/*
	 * Method Name : multiplication
	 */
	public int multiplication(int num1,int num2)
	{
		int result=0;
		try
		{
			result=(num1 * num2);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}

	/*
	 * Method Name : multiplication
	 */
	public int multiplication(int numbers[])
	{
		int result=1;
		try
		{
			for(int i=0;i<numbers.length;i++)
			{
				result=result*numbers[i];
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}
}
