
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
        int mark;
        int previous = 0;


        System.out.println("Enter the marks");
        for (int students = 0; students < n; students++) {
             mark = in.nextInt();
            aryNums[students] = mark;
          previous = mark + previous; 
            int total = previous + mark;
            if(students == (n - 1)){
                double answer = ((total - mark)/n);
                        answer = Math.round(answer*100)/100.0;

                System.out.println("The average is " + answer);
            }
        }
            

        


    }
}
