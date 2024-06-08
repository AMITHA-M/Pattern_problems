
import java.util.*;
 
public class SquareFillPattern{
    // Function to demonstrate printing pattern
    public static void squarefillpattern(int n)
    {
        int i, j;
        // outer loop to handle number of rows
        for (i = 0; i < n; i++) {
            // inner loop to handle number of columns
            for (j= 0; j<n; j++) {
                // printing stars
                System.out.print("* ");
            }
            // end-line
            System.out.println();
        }
    }
    // Driver Function
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter a number: ");
        int k = sc.nextInt();
        squarefillpattern(k);
        
    }
}