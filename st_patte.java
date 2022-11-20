import java.util.Scanner;

public class st_patte
{
    public static void main(String[]args)
    {
        String s = new String();
        Scanner sc = new Scanner(System.in);
        int a,b,v=0,con=0,vol=0;char ch=0;
        s = sc.nextLine();
        s = s.toUpperCase();
        
        for(a=0;a<s.length();a++)
        {
            ch = s.charAt(a);
            if(ch=='A' || ch=='E'||ch=='I'|| ch=='O' ||ch=='U')
            con++;
            else
            vol++;
        }
        System.out.println("Number of consonant from word "+con);
        System.out.println("Number of vowel from word "+vol);
        System.out.println(ch);
    }
}