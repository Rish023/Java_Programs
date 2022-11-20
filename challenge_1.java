import java.security.*;
import java.util.*;
public class challenge_1
{
    public static void main(String[]args)
    {
        int a;
        double b;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        a = sc.nextInt();
        System.out.println("Enter the decimal value :");
        b = sc.nextDouble();
        System.out.println("Enter a word, line or text :");
        s = sc.next();
        
        System.out.println("String "+s);
        System.out.println("Double "+b);
        System.out.println("Intger "+a);
    }
}