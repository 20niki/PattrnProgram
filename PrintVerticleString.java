import java.util.*;
public class PrintVerticleString {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter string");
	String s=sc.nextLine();
	
	for(int i=0;i<s.length();i++)
	{
			
			System.out.println(i+" "+s.charAt(i));
			

	}
	
	
	for(int i=0;i<s.length();i++)
	{
			
			System.out.print(i+" "+s.charAt(i));
			

	}
	}

}
