public class pattern_11 
/*

    *
   ***
  *****
 *******
*********

*/

{
	public static void main (String[] args)
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				if(j>i)
                {
				System.out.print(" ");
                }    
            }
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			for(int k=2; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
