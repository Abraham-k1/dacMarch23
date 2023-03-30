public class pattern_10

/*

    E
   D E
  C D E
 B C D E
A B C D E

*/
{
	 
    public static void main(String[] args)
    {
        
        int a = 70;
        
        for(int i=1; i<=5; i++)
        {
            
            for(int k=5; k>=i; k--)
            {
                System.out.print(" ");
            }
            
            for(int j=0; j<i; j++)
            {
                System.out.print((char)(a-i+j) + " ");
            }
            
               System.out.println();
               
        }
    }
}

