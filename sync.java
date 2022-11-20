import java.util.Scanner;

public class sync
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int ch,j;
        System.out.println("Enter 1 for Displaying letters and unicodes :)");
        System.out.println("Enter 2 for Displaying Floyd triangle program :)");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1:
                for(char i='A';i<='Z';i++)
                {
                    System.out.println(i+" ");
                }
                for(j=65;j<=90;j++)
                {
                    System.out.println((char)j+" ");
                }
            break;
            case 2:
                for(int n=1;n<=5;n++)
                {
                    for(int m=1;m<=n;m++)
                    {
                        System.out.print(m+" ");
                    }
                    System.out.println();
                }
            break;
        }
    }
}