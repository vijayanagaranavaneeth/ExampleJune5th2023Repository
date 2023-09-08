/*package P1Package;

public class IndependentclassInP1Package extends Protection
{	
	public  IndependentclassInP1Package()
	{
		System.out.println("IT IS A IndependentclassInP1Package CLASS CONSTRUCTOR");
		//System.out.println("private_a:"+private_a);
		System.out.println("Protected_b:"+Protected_b);
		System.out.println("Default_c:"+default_c);
		System.out.println("Public_d:"+Public_d);
	}
}*/

package P1Package;

public class IndependentclassInP1Package
{
	Protection o=new Protection();

	public  IndependentclassInP1Package()
	{
		System.out.println("IT IS A IndependentclassInP1Package CLASS CONSTRUCTOR");
		//System.out.println("private_a:"+private_a);
		System.out.println("Protected_b:"+o.Protected_b);
		System.out.println("Default_c:"+o.default_c);
		System.out.println("Public_d:"+o.Public_d);
	}
}