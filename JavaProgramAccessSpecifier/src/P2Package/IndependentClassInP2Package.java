package P2Package;

import P1Package.Protection;

public class  IndependentClassInP2Package 
{
	Protection o=new Protection();
	public IndependentClassInP2Package()
	{
		System.out.println("IT IS A PROTECTION CLASS CONSTRUCTOR");
		//System.out.println("private_a:"+private_a);
		//System.out.println("Protected_b:"+o.Protected_b);
		//System.out.println("Default_c:"+default_c);
		System.out.println("Public_d:"+o.Public_d);
	}
	
}
