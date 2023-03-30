public class star_9 

/* 

    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *

*/
{
    public static void main(String[] args)
    {
        int rows=9;
        int columns=5;
        for (int i=1; i<=rows; i++) 
        {
            for (int j=1; j<=columns; j++)
            {
                if(i<=5) 
                {
                    if (j<=5-i) 
                    {
                        System.out.print(" ");
                    } 
                    else
                    {
                        System.out.print("*");
                    }
                } 
                else 
                {
                    if (j<=i-5) 
                    {
                        System.out.print(" ");
                    } 
                    else
                    {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
    
}
	

