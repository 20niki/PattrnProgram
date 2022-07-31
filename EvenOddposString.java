import java.util.*;
public class EvenOddposString {

	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter String");
	String s=sc.nextLine();
	
	System.out.println("String is::"+" "+s);
	
	for(int i=0;i<s.length();i++)
	{
		if(i%2==0)
		{
			System.out.println(i+"\t"+s.charAt(i));
		}
	//	if(i%2!=0)
		//{
		//	System.out.println(i+"\t"+s.charAt(i));
	//	}
		
	}
	}
	}


