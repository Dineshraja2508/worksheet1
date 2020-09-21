
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;
import java.util.*;
/**
 *
 * @author ELCOT
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner obj = new Scanner(System.in);
        System.out.println("enter a number to generate fibo series");
        int n = obj.nextInt();
        int a = -1;
        int b = 1;
        int c = 0;
        for (int i = 0; i<n; i++){
          
            c = a+b;
            a= b;
            b=c;
            System.out.println(c);
        }
    }
    
}
