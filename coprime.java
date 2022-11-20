import java.util.Scanner;
public class coprime
  {
    public static void main(String[]args)
    {
      int x,y,hcf=0;int i; //Variable Declaration
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a numbers:");
      x = in.nextInt();
      y = in.nextInt();
      for(i=1;i<=Math.min(x,y);i++)
        {
          if(x%i==0 && y%i==0)
            hcf=i;
        }
      if(hcf==1)
        System.out.println("Co-Prime");
      else
        System.out.println("Not co-prime");
    }
  }