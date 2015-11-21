
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
public class A7Q2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        
        int height;
          System.out.println("How many people are calculating average of height for? in Centemeter");
        int n = in.nextInt();
        
        int previous = 0;
        int[] aryNums = new int[n];
        double average = ((previous)/n);
        
        System.out.println("Enter the heights");
        for (int people = 0; people < n; people++) {
             height = in.nextInt();
            aryNums[people] = height;
          previous = height + previous; 
       
                 
    }
        
                     }
    public static double calculation(int n){
        
    }
                 }



