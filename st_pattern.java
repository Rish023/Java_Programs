import java.util.Scanner;

public class st_pattern
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        String st;
        System.out.println("Enter the word");
        st = sc.next();
        st = st.toUpperCase();
        b = st.length();
        for(a=0;a<b;a++)
        {
            //System.out.println(st.charAt(a));
            System.out.println(st.charAt(a));
        }
    }
}