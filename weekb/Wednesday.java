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
public class Wednesday {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what word are you curious about?");
        String str = sc.nextLine();
        

        String blank = "";

        reverse(str, blank);
    }

    public static String reverse(String str, String blank) {
        char[] stringCharArray = str.toCharArray();
        for (int i = stringCharArray.length - 1; i >= 0; i--) {
            System.out.println(stringCharArray[i]);

            blank = blank + stringCharArray[i];

        }

        System.out.println("The orginal work was " + str);
        System.out.println("and the word backwards is " + blank);

        if (str.equals(blank)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        return str;
        // TODO Auto-generated constructor stub
    }

    public boolean isPalindrome(String str) {

        return false;
    }

    /**
     * @param args
     */
}
