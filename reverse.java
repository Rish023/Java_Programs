import java.util.Scanner;
class reverse
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	int i,r,n;
	System.out.println("Enter a number :");
	n = sc.nextInt();
	while(n>0)
	{
		r=n%10;
		n=n/10;
		System.out.print(r);
	}
  }
 }
