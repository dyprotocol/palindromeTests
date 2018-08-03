/*
 * Palindrome Analyzer Class
 * Contains two methods to test if string is
 * a palindrome using stacks
 */
package palindromes;

import java.util.Objects;
import java.util.Stack;

public class PalindromeAnalyzer 
{
    public static boolean isPalindromeOneStack(String testString)
    // Single stack to test whether the string is a palindrome
    {
        //crate stack object
        Stack<Character> myStack = new Stack<>();
        
        //push each char to stack
        for(int i = 0; i < testString.length(); i++)
            myStack.push(testString.charAt(i));
        
        String reverse = "";

        //reverse string equals each char in reverse
        while(!myStack.isEmpty())
            reverse += myStack.pop();
        
        //checks if strings are equal
        return testString.equals(reverse);        
        
    } // isPalindromeOneStack
    
    public static boolean isPalindromeTwoStack(String testString)
    // Two stacks to test whether the string is a palindrome when
    // capitalization, spaces, punctuation, and other non-alphanumeric 
    // characters are ignored.
    {
        char testChar;
        //create stack objects
        Stack<Character> myStack1 = new Stack<>();
        Stack<Character> myStack2 = new Stack<>();
        boolean result = false;
        
        // LOAD myStack1:
        for(int i = 0; i < testString.length(); i++)
            // Loop through each element in testString and verify if it
            // is a letter or digit
        {
            testChar = testString.charAt(i);
            
            if(Character.isLetterOrDigit(testChar))
                // Set testChar to lowercase and push onto myStack1
            {
                myStack1.push(Character.toLowerCase(testChar));
            } // End if statement
        } // End for loop
        
        // LOAD myStack2:
        for(int i = testString.length() - 1; i >= 0; i--)
            // Loop through each element in testString and verify if it
            // is a letter or digit
        {
            testChar = testString.charAt(i);
            
            if(Character.isLetterOrDigit(testChar))
                // Set testChar to lowercase and push onto myStack2
            {
                myStack2.push(Character.toLowerCase(testChar));
            } // End if statement
        } // End for loop
        
        // TEST myStack 1 and myStack2:
        while(!myStack1.isEmpty())
            // Loop through the stacks and compare while myStack1 is not empty
        {
            // Compare myStack1 to myStack2 and remove top value
            result = Objects.equals(myStack1.pop(), myStack2.pop()); 
        }
        
        return result;

    } // End isPalindromeTwoStack
    
}
