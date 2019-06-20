/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekb;

import java.util.Scanner;

/**
 *
 * @author McDesmond
 */
public class Thursday {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("what word what you like to use?");
        String str = sc.nextLine();

        System.out.println("what word are you looking for?");
        String substring = sc.nextLine();

        System.out.println("How many rows do you want in your pyramid");
        int x = sc.nextInt();


        containsSubstring(str, substring);

        System.out.println("The number of block in the pyramid is " + triangle(x));

    }

    public static boolean containsSubstring(String str, String substring) {
        if (str.contains(substring)) {
            System.out.println("The 2nd word is in the orignal word.");
            return true;
        } else {
            System.out.println("The 2nd word is not in the original word.");
        }
        return false;
    }

    public static int triangle(int numRows) {
        int totalNumOfBlocks = numRows * (numRows + 1) / 2;
        return totalNumOfBlocks;
    }
}
