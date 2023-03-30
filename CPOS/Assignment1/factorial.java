import java.util.Scanner;
public class factorial 
{
    public static void main(String[] args) 
    {
        long n;
        long mul = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer:");
        n = sc.nextLong();
        for(int i=1; i<=n; i++)
        {
            mul = mul*i;
        }
        System.out.println("Factorial of "+n+" is: "+mul);
    }
}