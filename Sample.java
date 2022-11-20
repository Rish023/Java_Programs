//Class 10 computer book pg - no - 189
//A complete program making use of the Input statement in arrays is illustrated below
import java.io.*; //Importing packages
import java.io.IOException; //Importing packages

public class Sample 
{
    public static void main(String[]args) throws IOException //Main method
    {
        InputStreamReader read = new InputStreamReader(System.in); // These line help to take input from user
        BufferedReader in = new BufferedReader(read); //Same as it is
        int i,sum;sum=0; //Variable Description
        int m[] = new int[10]; //Array Desclaration
        for(i=0;i<10;i++) // For loop begins
        {
            System.out.println("Enter the marks: ");
            m[i] = Integer.parseInt(in.readLine());
        }
        for(i=0;i<10;i++)
        sum = sum+m[i];
        System.out.println("The sum of the array elements = "+sum);
    }
}