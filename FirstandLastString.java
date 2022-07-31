import java.util.*;
public class FirstandLastString {

	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int i;
	System.out.println("Enter the string:");
	String s=sc.nextLine();
	
	for(i=0;i<s.length();i++)
	{
			System.out.println(i+"\t"+s.charAt(i));
			

	}
	System.out.println("First Letter  " +i+ "\t" +s.charAt(0));
	
	System.out.println("First Letter  " +i+ "\t" +(s.charAt(s.length()-1)));
}
}