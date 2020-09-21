/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifteenprg;
import java.util.*;
/**
 *
 * @author ELCOT
 */
public class Fifteenprg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("enter the number of elements you are going to enter in the array");
        Scanner obj = new Scanner(System.in);
        int temp;
        int n = obj.nextInt();
        int []array = new int[n];
        for(int i = 0; i<n;i++){
            array[i] = obj.nextInt();}
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(array[i]> array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;}
                            
                }}
        System.out.println("The ascending order");
        int i;
        for( i =0; i<n; i++){
            System.out.println(array[i]);
        }
    }
    
}
