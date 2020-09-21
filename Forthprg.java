/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forthprg;
import java.util.*;
/**
 *
 * @author ELCOT
 */
public class Forthprg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner obj = new Scanner(System.in);
        double a,b,d;
        System.out.println("enter the original product amount");
        a = obj.nextDouble();
        System.out.println("enter the discount percentage");
        d = obj.nextDouble();
        double disc = a *(d/100);
        System.out.println(disc + "   Is the discount amount");
        b = a-disc;
        System.out.println(b+ "    final payable amount");
    }
    
}
