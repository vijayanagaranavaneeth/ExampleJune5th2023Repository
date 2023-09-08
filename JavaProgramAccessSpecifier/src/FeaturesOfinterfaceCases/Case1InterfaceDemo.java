package FeaturesOfinterfaceCases;
interface University
{
	 void showuniversityname(String name);
}
class engineeringcollege implements University
{
	public void showuniversityname(String name)
	{
		System.out.println("university name:"+name);
	}
	
	void displayaddress(String address)
	{
		System.out.println("address of eng college:"+address);
	}
}

public class Case1InterfaceDemo 
{

	public static void main(String[] args) 
	{
		engineeringcollege o= new engineeringcollege();
		o.showuniversityname("vtu");
		o.displayaddress("Belgum");
	}

}
