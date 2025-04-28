package org.example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for the PalindromeChecker class.
 */
public class PalindromeCheckerTest {
    
    private PalindromeChecker checker;
    
    @Before
    public void setUp() {
        checker = new PalindromeChecker();
    }
    
    @Test
    public void testIsPalindromeWithSimplePalindrome() {
        assertTrue(checker.isPalindrome("racecar"));
        assertTrue(checker.isPalindrome("level"));
        assertTrue(checker.isPalindrome("deified"));
    }
    
    @Test
    public void testIsPalindromeWithMixedCaseAndPunctuation() {
        assertTrue(checker.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(checker.isPalindrome("No 'x' in Nixon"));
        assertTrue(checker.isPalindrome("Madam, I'm Adam."));
    }
    
    @Test
    public void testIsPalindromeWithNonPalindromes() {
        assertFalse(checker.isPalindrome("hello"));
        assertFalse(checker.isPalindrome("world"));
        assertFalse(checker.isPalindrome("Java"));
    }
    
    @Test
    public void testIsPalindromeWithEmptyAndNullStrings() {
        assertTrue(checker.isPalindrome(""));
        assertFalse(checker.isPalindrome(null));
    }
    
    @Test
    public void testIsPalindromeWithNumericPalindromes() {
        assertTrue(checker.isPalindrome("12321"));
        assertTrue(checker.isPalindrome("1221"));
        assertFalse(checker.isPalindrome("12345"));
    }
    
    @Test
    public void testCleanString() {
        assertEquals("abcdef", checker.cleanString("a b c, d-e-f!"));
        assertEquals("raceacar", checker.cleanString("Race a Car"));
        assertEquals("", checker.cleanString(".,;:!@#$%^&*()"));
        assertEquals("", checker.cleanString(null));
    }
}

