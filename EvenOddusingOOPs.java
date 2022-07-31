import java.util.*;
public class EvenOddusingOOPs {
	int n;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		 n=sc.nextInt();
	}
	public void logic()
	{
		if(n%2==0)
		{
			System.out.println("Number is EVEN");
		}
		else
		{
			System.out.println("ODD");
		}
	}
	public static void main(String[] args) {
		
		EvenOddusingOOPs Obj=new EvenOddusingOOPs();
		Obj.input();
		Obj.logic();
	}

}
