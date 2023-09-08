package P2Package;
import P1Package.Protection;
public class SubclassInP2Package extends Protection
{
	public SubclassInP2Package()
	{
		System.out.println("IT IS A SubclassInP2Package CLASS CONSTRUCTOR");
		//System.out.println("private_a:"+private_a);
		System.out.println("Protected_b:"+Protected_b);
		//System.out.println("Default_c:"+default_c);
		System.out.println("Public_d:"+Public_d);
	}
	
}
