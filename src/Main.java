/*
Question : Write a program to print string s, print all the substrings of s.
______________________________________________________________________________
Test case :
i\o = abcd
o\p = a ab abc abcd b bc bcd c cd d
 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Printing the substring of given string :");
        for (int i = 0; i <= str.length(); i++){
            for (int j = i; j <= str.length(); j++){
                System.out.print(str.substring(i,j) + " ");
            }
        }
    }
}