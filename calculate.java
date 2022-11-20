import java.util.Scanner;
import java.security.*;
public class calculate
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c,cal;
        System.out.println("Enter three numbers :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        double calc= (1/Math.pow(a,2))+(2/Math.pow(b,2)) + (3/Math.pow(c,2));
        //long roundExp = Math.round(calc);
        System.out.println(calc);
        double cac = 1/1+2/4+3/27;
        System.out.println(cac);
    }
}