

/*Q8. Create a pattern below.
a
B c
D e F
g H i J
k L m N o
*/

public class Pattrn
{
	int i,j;
	int c=64,p=1,s=96;
	
	public void pattern()
	{
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=i; j++,p++)
			{
				if(p%2==1)
					System.out.print((char)(p+s)+" ");
				else
					System.out.print((char)(p+c)+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		Pattrn p = new Pattrn();
		p.pattern();
	}
}