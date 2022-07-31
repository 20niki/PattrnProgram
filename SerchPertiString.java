import java.util.*;
public class SerchPertiString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int i;
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		System.out.println("Enter elem do ypu wants to search:");
		char ch=sc.next().charAt(0);
		
		for( i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
				count++;
			}
		}
		if(count>0)
		{
		System.out.println("Elements are  " + ch+" "+count+"Times");
		}
	}

}
