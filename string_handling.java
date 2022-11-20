public class string_handling
{
    public static void main(String[]args)
    {
        String s = "COMPUTER";
        String n = "KOLKATA";
        System.out.println(s.length());
        System.out.println(s.charAt(7));
        System.out.println(s.indexOf('C'));
        System.out.println(n.indexOf('K',1));
        System.out.println(n.lastIndexOf('A'));
    }
}