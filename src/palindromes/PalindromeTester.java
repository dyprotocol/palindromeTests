//************************************************************************
//  CLASS:    	OBJECT-ORIENTED PROGRAMMING I  
//  GROUP:	GROUP 3
//  MEMBERS:	CHRIS / DOUA / SAMUEL
//  PROJECT:	CHAPTER 13; PROGRAMMING PROJECT 13.8
//************************************************************************
// Design and implement a program that prompts the user to enter a string
// and then performs two palindrome tests. The first should use a single 
// stack to test whether the string is a palindrome. The second should use 
// two stacks to test whether the string is a palindrome when capitalization, 
// spaces, punctuation, and other non-alphanumeric characters are ignored. 
// The program should print the results of both tests.
//************************************************************************

package palindromes;

import java.util.Scanner;

public class PalindromeTester 
{
    /*
     *Palindrome driver class
    */
    public static void main(String[] args) 
    {     
        String input = "";
        
        Scanner myScan = new Scanner(System.in);
        
        // Request and capture user input
        System.out.println("Enter a string: ");
        input = myScan.nextLine();
        
        // Send input string to check for single stack palidrome
        System.out.println("Test 1 (One Stack):");
        if(PalindromeAnalyzer.isPalindromeOneStack(input))
            System.out.println(input + " is a palindrome.");
        else
            System.out.println(input + " is not a palindrome.");
        
        System.out.println(); // Blank line
        
        // Send input string to check for double stack palidrome
        System.out.println("Test 2 (Two Stack):");
        if(PalindromeAnalyzer.isPalindromeTwoStack(input))
            System.out.println(input + " is a palindrome.");
        else
            System.out.println(input + " is not a palindrome.");
        
    } // End main
} // End PalindromeTester class