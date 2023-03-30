public class star_10

/*

        ******
       ******
      ******
     ******
    ******
    
*/    
{
        public static void main (String args[])
        {
            int n=5;
            int i,j;
            for(i=0; i<n; i++)
            {
                for(j=5; j>=i; j--)
                {
                    System.out.print(" ");
                }
                for(j=1; j<=n; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

