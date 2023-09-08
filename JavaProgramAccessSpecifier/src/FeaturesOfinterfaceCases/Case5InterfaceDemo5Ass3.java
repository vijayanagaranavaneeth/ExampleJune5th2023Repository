package FeaturesOfinterfaceCases;
interface University5
{
	void showuniversityname(String name);
}
interface college5
{
	void displayAddress(String name);
}

abstract class Engineering1
{
	abstract void showcollegename(String name);
	abstract void displatcityname(String name);
}
class Engineering extends Engineering1 implements University5,college5
{
	void showcollegename(String name)
	{
		System.out.println("showcollegename name:"+name);
	}
	void displatcityname(String name)
	{
		System.out.println("displatcityname name:"+name);
	}
	public void showuniversityname(String name)
	{
		System.out.println("showuniversityname name:"+name);
	}
	public void displayAddress(String name)
	{
		System.out.println("displayAddress:"+name);
	}
}

public class Case5InterfaceDemo5Ass3 
{

	public static void main(String[] args) 
	{
		Engineering y=new Engineering();
		y.showcollegename("BMS");
        y.displatcityname("Bangalore");
        y.showuniversityname("VTU");
        y.displayAddress("Bangalore");
	}

}
