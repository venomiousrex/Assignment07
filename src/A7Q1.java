
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hadik9595
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);

        System.out.println("How many students are in class?");
        int n = in.nextInt();

        int[] aryNums = new int[n];
        n = n + 1;


        System.out.println("Enter the marks");
        for (int students = n; students > 0; students--) {
            int mark = in.nextInt();
            aryNums[students] = mark;
        }


        System.out.println("The average is ");


    }
}
