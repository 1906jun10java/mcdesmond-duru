/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.revature.codingchallenge;

import java.util.Scanner;

/**
 *
 * @author McDesmond
 */
public class Mutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 8-character long string, with \n" +
"choices from \"A\", \"C\", \"G\", \"T\".?");
        
        String gene = sc.nextLine();
        String end;
        String blank = "";
        utility(gene, blank);
    }

    public static void utility(String gene, String blank) {
        char[] geneArray = gene.toCharArray();
        for (int i = 0; i < geneArray.length; i++) {
            blank = blank + geneArray[i];
  
        }

        for (int x = 0; x >= 0; x++) {
            if (blank.equals(gene)) {
                x = -1;
            } else {
                x = 1;
            }
        }
        
    }
}
