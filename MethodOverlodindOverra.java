class Abc
{
	public void disp()
	{
		System.out.println("JAVA");
		System.out.println("I am in Codenera");
		
	}
	public void disp1()
	{
		System.out.println("I am CODENERA");
	}
}
class C extends Abc
{
	public void disp()
	{
	System.out.println("Pune Codenera");
	System.out.println(" AAAAA");
	super.disp();
}
}


public class MethodOverlodindOverra {

	public static void main(String[] args) {
		C obj=new C();
		obj.disp();
		obj.disp1();
		
	}

}
