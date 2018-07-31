/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
