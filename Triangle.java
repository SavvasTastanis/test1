/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

import java.util.Scanner;

/**
 *
 * @author Stefg
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, space,rows, k=0;
        Scanner scan=new Scanner (System.in);
        System.out.print("Enter Number of Rows : ");
        rows=scan.nextInt();
        for (i=1;  i<= rows;  i++)
        {
            for (space=1; space<=(rows-i); space++)
            {
                System.out.print("   ");
            }
            while(k  !=  (2*i-1))
            {
                System.out.print("*   ");
                k++;
            }
            k=0;
            System.out.println();
        }
        
    }
    
}
