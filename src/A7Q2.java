
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int height;
          System.out.println("How many people are calculating average of height for?");
        int n = in.nextInt();
        
        int previous = 0;
        int[] aryNums = new int[n];
        double average = ((previous)/n);
        
        System.out.println("Enter the heights");
        for (int people = 0; people < n; people++) {
             height = in.nextInt();
            aryNums[people] = height;
          previous = height + previous; 
       
                 average = ((previous)/n);
                 if(average > height){
                     System.out.println("Here's heights"+ height);       
                
    }
            if(people == (n-1)){
             for(int count = n; count > 0; count--){
                if(height > average){
                System.out.println("above average are" + height);
                
                
             }
}
    }
}
}
}
