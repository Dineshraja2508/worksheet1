/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourteenprg;

/**
 *
 * @author ELCOT
 */
public class Fourteenprg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int[]m = {0,1,2,3,4};
        int[]n = new int[5];
        int ind = 4;
        for(int i = 0; i<5; i++){
            n[i] = m[ind];
            ind-=1;}
        System.out.println("the original array");
        for(int i=0; i<5;i++){
            System.out.println(m[i]);}
            
        System.out.println("The reversed array");
        for(int i=0; i<5;i++){
            System.out.println(n[i]);}
    }
    
}
