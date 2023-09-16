package com.sgtesting.tests;

public class ExecuteAutoITTestScriptDemo {

	public static void main(String[] args) {
		executeDemo();

	}
	
	private static void executeDemo()
	{
		try
		{
		//	Runtime.getRuntime().exec("E:\\DemoAutomation\\AutoIT\\FirstAutoItTest.exe");
			Runtime obj=Runtime.getRuntime();
			obj.exec("E:\\DemoAutomation\\AutoIT\\LaunchApplicationAndCloseApplicationDemo.exe");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
