import java.util.Scanner;
 
class sumofdigits{
     
    static int getSum(int n)
    {   
        int sum = 0;
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }
    return sum;
    }
    public static void main(String[] args)
    {   
        System.out.println("Enter an integer:");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getSum(n));
    }
}
 
