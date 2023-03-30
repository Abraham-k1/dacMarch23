public class pattern_9 

/*

         A
        A B
       A B C
      A B C D
     A B C D E

*/    

{
    public static void main (String[] args)
    {
            for (char a = 65; a<70; a++)
            {
                for(char b=69; b>=a; b--)
                {
                    System.out.print(" ");
                }
                for(char c=65; c<=a; c++)
                {
                    System.out.print(c+" ");
                }
                System.out.println();
            }
    }
}
    

