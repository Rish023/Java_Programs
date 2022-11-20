import java.util.Scanner;
public class sum_of_prime
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,sum=0,i;
       int m[] = new int[10];

        for(i=0;i<10;i++)
        {
            System.out.println("Enter a number :");
            m[i] = sc.nextInt();
        }
        for(i=0;i<10;i++)
            sum = sum+m[i];

        System.out.println(sum);
    }
}
