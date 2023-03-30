import java.util.*;
public class addwithoutplus {

    static int add(int a, int b)
    {
       
        for (int i = 1; i <= b; i++)
            a++;
        return a;
    }
 
    public static void main(String[] args)
    {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int x=sc.nextInt();
        
        System.out.println("Enter second number:");
        int y=sc.nextInt();
        int a = add(x, y);
        System.out.print("The sum is: "+a);
    }
}
 

