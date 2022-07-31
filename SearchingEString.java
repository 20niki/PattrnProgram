import java.util.*;
public class SearchingEString {

	
	public static void main(String[] args) {
		int count=0;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the String:");
	String s=sc.nextLine();
	
	System.out.println("Enter the Elements Which Do you wnats to search:");
	char ch=sc.next().charAt(0);
	
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)==ch)
		{
			count++;
		}
	}
	if(count>0)
	{
		System.out.println("Element are Found"+" "+count+"Times");
	}
	else
	{
		System.out.println("Element are NOT Found");
	}
	}

}
