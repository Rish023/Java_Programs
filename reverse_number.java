import java.util.*;

public class reverse_number
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int rem,rev=0,num=sc.nextInt();
        while(num!=0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num/10;
        }
        System.out.println("The number after reversing "+rev);
    }
}