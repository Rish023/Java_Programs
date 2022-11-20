import java.util.Scanner;
public class perfect_number
{
    public static void main(String[]args)
    {
        int n,i,sum=0;
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(n==sum)
        {
            System.out.println("Perfect Number!!!");
        }
        else
        {
            System.out.println("Not a Perfect Number!!!");
        }
    }
}