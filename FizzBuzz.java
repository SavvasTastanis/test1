/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

import java.util.Scanner;

/**
 *
 * @author Stefg
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Give a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if(a % 3 == 0){
            System.out.println("Fizz");
        }
        else{
            System.out.println(a);
        }
        for (int i = 0; i < 100; i++) {
            if(a % 5 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(i);
        }
        }
    }
}
