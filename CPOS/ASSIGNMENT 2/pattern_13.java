public class pattern_13 

/*

    A
   B B
  C C C
 D D D D
E E E E E

*/

{
    	public static void main(String[] args)
	{
		char a = 65;
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int k=i; k<=5; k++)
			{
				System.out.print(a+" ");
				
			} 
			System.out.println();
			a++;
			
		}
    }
}
