import java.util.*;

public class ReverseString {

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter the String:");
		String s=sc.nextLine();
	
		for(i=(s.length()-1);i>=0;i--)
		{
			System.out.print(" "+s.charAt(i));
		}
	}

}
