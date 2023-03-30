import java.util.Scanner;
    class palindrome {
        public static void main(String[] args) {
      System.out.println("Enter a number or string to check if palinrome:");
Scanner sc=new Scanner(System.in);
          String str = sc.nextLine(); 
          String reverseStr = "";
          
          int strLength = str.length();
      
          for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
          }
      
          if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome!");
          }
          else {
            System.out.println(str + " is not a Palindrome.");
          }
        }
      }   

