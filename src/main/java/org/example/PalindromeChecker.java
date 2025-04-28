package org.example;

/**
 * A utility class for checking if strings are palindromes.
 * A palindrome is a word, phrase, number, or other sequence of characters
 * that reads the same forward and backward.
 */
public class PalindromeChecker {

    /**
     * Checks if the provided string is a palindrome.
     * 
     * @param input The string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        
        String cleaned = cleanString(input);
        if (cleaned.isEmpty()) {
            return true; // Empty strings are considered palindromes
        }
        
        int left = 0;
        int right = cleaned.length() - 1;
        
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    /**
     * Cleans the input string by removing non-alphanumeric characters
     * and converting to lowercase.
     * 
     * @param input The string to clean
     * @return The cleaned string
     */
    public String cleanString(String input) {
        if (input == null) {
            return "";
        }
        
        // Remove all non-alphanumeric characters and convert to lowercase
        return input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }
}

