public class pattern_18 

/*

A B C D E 
A B C D 
A B C 
A B 
A

*/
{
	public static void main (String[] args)
	{
		char a=65;
		for(int i=1; i<=5; i++)
		{
			for(char j=65; j<=70-i; j++)
			{
				System.out.print(j+" ");
			
			}
			System.out.println();
			
		}
	}
}

