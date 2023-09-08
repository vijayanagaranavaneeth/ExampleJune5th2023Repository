package FeaturesOfinterfaceCases;


interface University2
{
	void showuniversityname(String name);
}
interface College2 extends University2
{
	abstract void displaycollegename(String name);
}
interface branch2 extends University2
{
	void displaycollegename(String name);
}


class engineeringcollege2 implements College2
{
	public void showuniversityname(String name)
	{
		System.out.println("university name:"+name);
	}
	public void displaycollegename(String name)
	{
		System.out.println("college name:"+name);
	}
	public void branchname(String name)
	{
		System.out.println("Branch name:"+name);
	}
	void displayaddress(String address)
	{
		System.out.println("address of eng college:"+address);
	}
}



public class Case3InterfaceDemo3 
{

	public static void main(String[] args) 
	{
		engineeringcollege2 o= new engineeringcollege2();
		o.showuniversityname("VTU");
		o.displaycollegename("SMCE");
		o.branchname("E&E");
		o.displayaddress("Bangalore");

	}

}
