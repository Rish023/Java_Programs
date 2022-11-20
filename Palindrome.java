import java.util.Scanner; //Importing packages
public class palindrome {
    public static void main() { //Main method or function
        int n,m,rev=0,rem;
        Scanner sc = new Scanner(System.in); //Scanner object
        n = sc.nextInt();
        m=n;
        while (m!=0){
            rem = m % 10;
            rev = rev * 10 +rem;
            m = m /10 ;
        }
        if(n==rev)
        {
            System.out.println("Palindrome number ");
        }
        else
        {
            System.out.println("Not a palindrome number ");
        }
        }
}



