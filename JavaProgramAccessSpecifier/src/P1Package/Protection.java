package P1Package;
//package p1 contains class called protection
public class Protection 
{
	/*it contains some of the members,the members are
	 * it contains 4 variables ,instead of declaring a b c d 
	 * here we declared meaningfully so easy to we can manage 
	 * so next we have to print the values stored in the particular variables*/
	private int private_a=100;
	protected int Protected_b=200;
	int default_c=300;
	public int Public_d=400;
	
	
/*A class or a method or a data field specified as 'public' is accessible 
 * from any class or package in the Java program. 
 * The public entity is accessible within the package as well as outside the package. 
 * In general, public access modifier is a modifier that does not restrict the entity at all.
 * 
 */
	public Protection()
	{
		System.out.println("IT IS A PROTECTION CLASS CONSTRUCTOR");
		System.out.println("private_a:"+private_a);
		System.out.println("Protected_b:"+Protected_b);
		System.out.println("Default_c:"+default_c);
		System.out.println("Public_d:"+Public_d);
	}
}
