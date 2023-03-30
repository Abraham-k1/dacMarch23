
import java.util.*;
import java.io.*;
 
class print_digits{
 
    public static void main(String[] args)
    {   System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
      
        int number = input.nextInt();
 
        String string_number = Integer.toString(number);
 
        for (int i = 0; i < string_number.length(); i++) {
 
            System.out.println(string_number.charAt(i));
        }
    }
}

