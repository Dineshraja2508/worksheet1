/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevenprg;
import java.util.*;
/**
 *
 * @author ELCOT
 */
public class Elevenprg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner obj = new Scanner(System.in);
        System.out.println("enter a number");
        int a = obj.nextInt();
        System.out.println("enter the next muber to add");
        int b = obj.nextInt();
        int c = a+b;
        System.out.println("The answer is" + c );
    }
    
}
