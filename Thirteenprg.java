/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirteenprg;
import java.util.*;
/**
 *
 * @author ELCOT
 */
public class Thirteenprg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("enter the no of elements you are gonna enter");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] m = new int[n];
        int pos = 0,neg = 0,zero = 0;
        System.out.println("Enter the array elements ");
        for(int i = 0; i<n; i++){
            m[i] = obj.nextInt();
            if(m[i]<0){
                neg +=1;}
            else if(m[i]>0){
                pos+=1;}
            else{
                zero+=1;}
        }
        System.out.println("Number of positive integers " +  pos);
        System.out.println("\n Number of negative integers"+  neg);
        System.out.println("number of zeros entered"+  zero);
    }
    
}
