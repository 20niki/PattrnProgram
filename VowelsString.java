import java.util.*;

public class VowelsString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		
		System.out.println("Enter the charcter");
		char ch=sc.next().charAt(0);
		 
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			
		{
			
			System.out.println("is vowel"+ch);
		}
		else
		
		{
			System.out.println(" Not Vowel "+ch);
		}
		
	}

}
