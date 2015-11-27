
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Why can't we just use remainders and a while loop to find prime numbers
        // Plan is to find first multiples of numbers < 10 and cross out those multiples over 10, then print out whats left.
        Scanner in = new Scanner(System.in);
        
        int zero = 0;
        int[] array = new int [1000];
        for(int i = 2; i < 13; i++){
        for(int p = 0; p <1001; p = p + i){
            
            if(p <= 10 ){
                System.out.println(p);
            }
                    
            if(p >= 10){
               array[i] = zero;
            }
             
        }
           
        }
    }
    
}
