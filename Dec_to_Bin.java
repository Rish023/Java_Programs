import java.util.Scanner;

public class Dec_to_Bin
{
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),p,a;
        String str = " ";
        p=n;
        while (p>0){
            a = p % 2;
            str = a + str;
            p = p/2;
        }
        System.out.println("Original Number "+n);
        System.out.println("Binary number "+str);
    }
}
