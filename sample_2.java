import java.util.Scanner;

class sample_2
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int i,sum;sum=0;
        int m[] = new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println("Enter your marks: ");
            m[i] = sc.nextInt();
        }
        for(i=0;i<10;i++)
        sum = sum+m[i];
        System.out.println("The sum of the array elements = "+sum);
    }
}