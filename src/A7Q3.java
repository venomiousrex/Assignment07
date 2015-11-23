
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] digits = new int[2];
        System.out.println("Enter two integers:");
        for(int i = 0; i < 2; i++){
            int digit = in.nextInt();
            
           digits[i] = digit;
            
        }
        int temp = digits[0];
        for(int i = 0; i < 1; i++){
       
          
        if( temp < digits[1]){
            digits[0] = digits[1];
            digits[1] = temp;
            System.out.println(digits[1]);
        }else{
            
        }
        }
        
        
         
        
    }
}
