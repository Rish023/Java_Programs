import java.util.Scanner;

public class consonant
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,v=0;
        String st;
        char chr;
        System.out.println("Enter a word :");
        st = sc.next();
        b = st.length();
        for(a=0;a<b;a++)
        {
            chr = st.charAt(a);
            if(chr=='a' || chr=='e'||chr=='i'||chr=='o'||chr=='u' ||chr=='A'||chr=='E'||chr=='I'||chr=='O' ||chr=='U')
            v=v+1;
        }
        System.out.println("The number of vowels in the string:"+v);
    }
}