package Methods;
import java.util.Scanner;
public class Dis
{
    void discount(int d)
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a mark price ");
        double mp = scr.nextDouble();
        double sp = scr.nextDouble();
        System.out.println("Sp "+sp);
    }
    void discount(int d1,int d2)
    {
        Scanner scr = new Scanner(System.in);
        double mp = scr.nextDouble();
        double sp = (1-d1/100.0)*(1-d2/100.0)*mp;
        System.out.println("sp="+sp);
    }
    void discount(int d1,int d2,int d3)
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the mp ");
        double mp = scr.nextDouble();
        double sp = (1-d1/100.0)*(1-d2/100.0)*(1-d3/100.0)*mp;
        System.out.println("Sp="+sp);
    }
}