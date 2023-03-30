import java.util.Scanner;
public class positiveornegative {
    public static void main(String args[]){
        System.out.println("Enter a number:");
        Scanner sc= new Scanner(System.in);
        long number= sc.nextLong();
        if (number>0) System.out.println("The number you've entered is positive");
        else if (number==0) System.out.println("The number you've entered is neither positive nor negative");
        else System.out.println("The number you've entered is negative");
    }
    
}
