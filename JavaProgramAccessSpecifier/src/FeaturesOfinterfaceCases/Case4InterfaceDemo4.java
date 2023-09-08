package FeaturesOfinterfaceCases;
interface Employee
{
	void showEmployeename(String name);
	void showjobname(String name);
}
class Department implements Employee
{
	public void showEmployeename(String name)
	{
		System.out.println("employee name:"+name);
	}
	public void showjobname(String name)
	{
		System.out.println("Job name:"+name);
	}
	 void ShowAddress(String name)
	{
		System.out.println("Address name:"+name);
	}
}
public class Case4InterfaceDemo4 
{

	public static void main(String[] args) 
	{
		Employee e=new Department();
		e.showEmployeename("Mohan");
		e.showjobname("Manager");
	}

}
