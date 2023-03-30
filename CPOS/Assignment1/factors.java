import java.util.Scanner;
public class factors{

    public static void main(String[] args) {
  System.out.println("Enter a number you want factorial of:");
  Scanner sc= new Scanner(System.in);
      int number = sc.nextInt();
  
      System.out.print("Factors of " + number + " are: ");
  
      for(int i = 1; i <= number; ++i) {
  
        if (number % i == 0) {
          System.out.print(i + " ");
        }
      }
    }
  }