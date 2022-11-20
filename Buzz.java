import java.util.Scanner;

public class Buzz
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number to be checked :");
        int a = sc.nextInt();
        if((a%10==7) || (a%7==0))
        {
            System.out.println(a +" is a buzz number");
        }
        else
        {
            System.out.println(a +" is not a buzz number");
        }
    }
}