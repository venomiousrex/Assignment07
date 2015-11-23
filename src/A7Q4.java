
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
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] array = new int [10];
        
        System.out.println("Enter the marks!");
        int mark = in.nextInt();
        for(int i = 0; i < 10; i++){
        array[i] = mark;
                }
        
        for(int i = 0; i < 10; i++){
            int next = i + 1;
            if(array[i] > array[next]){
                array[i] = array[next];
                array[next] = array[i];
                System.out.println(array[0] + array[1]);
            }
        }
    }
    
}
