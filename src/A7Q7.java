
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
        //Simplified 
        // Plan is to find first multiples of numbers < 10 and cross out those multiples over 10, then print out whats left.
        Scanner in = new Scanner(System.in);
        
        int zero = 0;
        int[] array = new int [1001];
        
        for(int i = 0; i <= 1000; i++ ){
            array[i] = i;
//            System.out.println(array[i]);
        }
        
        for (int i = 2; i < 31; i++) {
            for (int j = 2; j < array.length; j++) {
               
                
                int temp = j*i;
                
               
               if(temp <= 1000){
                   
                   array[temp] = 0;
//               System.out.println(temp);
               }
               
               
              
             
            }
        }
         System.out.println("There");
         for (int i = 0; i < array.length; i++) {
             if (array[i] != 0) {
                 System.out.println(array[i]);
             }
             
        }
           
        }
        }
           
        
    
    

