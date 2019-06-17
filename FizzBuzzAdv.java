/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.revature.advfizzbuzz;
import java.util.Scanner; 
/**
 *
 * @author McDesmond
 */


    
class FizzBuzz {
    public static void fizzBuzzBasic (){
          
    }
}
      
public class FizzBuzzAdv {

    public static void main(String[] args) {
        
        FizzBuzz obj = new FizzBuzz();
        obj.fizzBuzzBasic();
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("what is the min number?");
        int min = sc.nextInt();
        
        System.out.println("what is the max number?");
        int max = sc.nextInt();
        
        System.out.println("what is the first multiple");
        int x = sc.nextInt();
        
        System.out.println("what is the second multiple?");
        int y = sc.nextInt();
        
      
        for (int i = 1; i<=100; i++) {
            if (i% (x * y) ==0){
                System.out.println("FizzBuzz");
            }else if (i%x==0){
                System.out.println("Fizz");
            }else if (i%y==0){
                System.out.println("Buzz");
            }else
                System.out.println(i);
        
        }
        
    }
}

class FizzBuzzAdvanced {
    public void fizzBuzzAdvanced (){
    
    }
}
