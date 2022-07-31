import java.util.*;
public class UperLowerString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int upcase=0;
		int Locase=0;
		//int whitespace=0;
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		
		 for(int i = 0; i < s.length(); i++) 
		 {
			 if(s.charAt(i) >= 'a' && s.charAt(i)<='z')
			 {
				 Locase++;
				 
			 }
			
			  if(s.charAt(i) >= 'A' && s.charAt(i)<='Z')
			 {
				 upcase++;
				
			 }
				
		 }
			 System.out.println("Uper "+upcase);
			 System.out.println(" Lower"+ Locase);
		 
		
	}

}
