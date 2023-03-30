import java.util.Scanner;  
public class swap3rdvar 
{
    public static void main(String a[])   
    {   
        System.out.println("Program to swap two numbers without using 3rd variable");  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter first number: ");
        int x = sc.nextInt();  
        System.out.println("Enter second number: ");
        int y = sc.nextInt();  
        System.out.println("before swapping numbers: "+x +" "+ y);  
        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping: "+x +"  " + y);   
    }   
}  

