import java.util.Scanner;
public class pro
{
    public void star(){
   for(int i=1;i<=4;i++)
   {
    for(int j=4;j>=i;j--)
    {
        System.out.print(" ");
    }
    for (int k = 1; k <= i; k++) {
      
        System.out.print(" *");
    }
    System.out.println();
   }
    }
    
}
