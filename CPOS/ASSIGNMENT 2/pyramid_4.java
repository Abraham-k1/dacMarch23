public class pyramid_4
/* 
                1  
              1 2 1  
            1 2 3 2 1  
          1 2 3 4 3 2 1  
        1 2 3 4 5 4 3 2 1  
      1 2 3 4 5 6 5 4 3 2 1  
    1 2 3 4 5 6 7 6 5 4 3 2 1  
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1  
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 

*/
{
public static void main(String[] args)
            {
            int n=9, i, j, k;

            System.out.print("");
            for(i=1; i<=n; i++)
            {

                for (j=1; j<=n-i; j++)
                System.out.print("  ");

                for (j=1, k=2*i-1; j<=2*i-1; j++, k--)
                {
                if(j<=k)
                System.out.print(j+" ");
                else
                System.out.print(k+" ");
                }
                
                System.out.println(" ");
               
                

            }

            }
}  

