package FeaturesOfinterfaceCases;
interface University1
{
	void showuniversityname(String name);
}
interface college
{
	void displaycollegename(String name);
}
interface branch
{
	void displaycollegename(String name);
}
class engineeringcollege1 implements University1,college,branch
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

public class Case2InterfaceDemo2 
{

	public static void main(String[] args) 
	{
		engineeringcollege1 o= new engineeringcollege1();
		o.showuniversityname("vtu");
		o.displaycollegename("B M S");
		o.branchname("E&C");
		o.displayaddress("Belgum");
	}

}
