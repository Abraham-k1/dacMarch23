public class hollow_inverted_half_pyramid {
    public static void main(String args[]){
/*	
    * * * * * *
    *       *
    *     *
    *   *
    * *
    *								
*/	
    for(int i=1;i<=1;i++)
    {
        for(int j=i;j<=6;j++)
        {
            System.out.print("* ");	
        }
        System.out.println();	 
    }
    
    for(int i=1;i<=5;i++)
    {
     
        for(int j=5;j>=i;j--)
        {
            if(j==5||i==j)
            System.out.print("* ");	
            else
            System.out.print("  ");
        }
        System.out.println();	 
    }
}
}
