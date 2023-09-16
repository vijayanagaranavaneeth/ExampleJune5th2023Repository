package com.sgtesting.tests;
interface University
{
	abstract void showUniversityName(String name);
}
interface College
{
	abstract void showCollegeName(String name);
}
class EnggCollege implements University,College
{
	public void showUniversityName(String name)
	{
		System.out.println("University Name :"+name);
	}
	
	public void showCollegeName(String name)
	{
		System.out.println("College Name :"+name);
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		University obj=new EnggCollege();
		obj.showUniversityName("Bangalore Univerity");
		
		College college=(College) obj;
		college.showCollegeName("BMS Degree College");
	}

}
