/*
 * Group 3
 * Programming Exercise 13.8
 * Design and implement a program that prompts
 * the user to enter a string and then performs
 * two palindrome tests. The first should use a 
 * single stack to test whether the string is a 
 * palindrome. The second should use two stacks 
 * to test whether the string is a palindrome when
 * capitalization, spaces, punctuation, and other 
 * non-alphanumeric characters are ignored. The 
 * program should print the results of both tests.
 */
package palindromes;

import java.util.Scanner;
import java.util.Stack;

public class Palindromes 
{
    public static void main(String[] args) 
    {
        String input = "";
        
        Scanner myScan = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        input = myScan.nextLine();
        
        if(isPalindromeOneStack(input))
            System.out.println(input + " is a palindrome.");
        else
            System.out.println(input + " is not a palindrome.");
    }  
    
    public static boolean isPalindromeOneStack(String s)
    {
        //crate stack object
        Stack<Character> myStack = new Stack<>();
        
        //push each char to stack
        for(int i = 0; i < s.length(); i++)
            myStack.push(s.charAt(i));
        
        String reverse = "";
        
        //reverse string equals each char in reverse
        while(!myStack.isEmpty())
            reverse += myStack.pop();
        
        //checks if strings are equal
        if(s.equals(reverse))
            return true;
        else
            return false;        
    }
}
