import java.util.Scanner;
class odd_even 
{
public static void main (String args[])
{
System.out.println("Enter a number:");
Scanner sc =new Scanner(System.in);
long number = sc.nextLong();
String output;
if ((number %2) == 0){output="Even";}
else {output="Odd";}
System.out.println(number+" is "+output);
}
}