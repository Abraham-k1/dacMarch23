public class pattern_17 

/* 

1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/
{
	public static void main (String[] args)
	{
		int c=1;
		for(int a=1; a<=5; a++)
		{
			for(int b=1; b<=a; b++)
			{
				System.out.print((c++)+" ");
			}
			System.out.println();
		}
	}
}

