/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seventhprg;
import java.util.*;
/**
 *
 * @author ELCOT
 */
public class Seventhprg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         {
     int n=5;
 
     double m[]=new double[n];
 
     double g[]=new double[n];
 
     double cgpa,sum=0;
     Scanner obj= new Scanner(System.in);
    
     System.out.println("Enter maths marks");
     m[0]=obj.nextInt();
     System.out.println("enter computer science marks"); 
     m[1]=obj.nextInt();
     System.out.println("enter OOPS marks");
     m[2]=obj.nextInt();
     System.out.println("enter DS marks");
     m[3]=obj.nextInt();
     System.out.println("enter DPSD marks");
     m[4]=obj.nextInt();
 
     for(int i=0;i<n;i++)
     {
       g[i]=(m[i]/10);
     }
 
     for(int i=0;i<n;i++)
     {
        sum+=g[i];
     }
 
     cgpa=sum/n;
 
     System.out.println("cgpa="+cgpa);
 
     
 
    }
    
    }
}
