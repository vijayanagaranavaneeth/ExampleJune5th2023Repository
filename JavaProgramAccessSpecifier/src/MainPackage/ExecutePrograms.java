package MainPackage;
//main package we have a main class "ExecutePrograms"
import P1Package.Protection;
import P1Package.SubclassInP1Package;
import P1Package.IndependentclassInP1Package;
import P2Package.SubclassInP2Package;
import P2Package.IndependentClassInP2Package;

public class ExecutePrograms 
{

	public static void main(String[] args) 
	{
		//execute protection class constructor
		//Protection o=new Protection();
		
		//Execute SubclassInP1Package class constructor
		//SubclassInP1Package o2=new SubclassInP1Package();
		
		//Execute IndependentclassInP1Package class construct  
		IndependentclassInP1Package o3=new IndependentclassInP1Package(); 
		
		//Execute SubclassInP2Package class constructor
		//SubclassInP2Package o4=new SubclassInP2Package();
		
		//Execute IndependentClassInP2Package class constructor
		//IndependentClassInP2Package o5=new IndependentClassInP2Package();
		
	
	}

}
