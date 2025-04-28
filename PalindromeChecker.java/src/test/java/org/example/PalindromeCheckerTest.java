package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    private PalindromeChecker checker;

    @BeforeEach
    void setUp() {
        // Inicializa el objeto antes de cada prueba
        checker = new PalindromeChecker();
    }

    @Test
    void testPalindromoAna() {
        assertTrue(checker.isPalindrome("ana"),
                "Debería ser true: 'ana' es un palíndromo");
    }

    @Test
    void testNoPalindromoNandu() {
        assertFalse(checker.isPalindrome("ñandú"),
                "Debería ser false: 'ñandú' no es un palíndromo");
    }
    @Test
    void testPalindromoPalabraLarga() {
        assertTrue(checker.isPalindrome("anitalavalatinaosoosoosoanitalavalatina"),
                "Debería ser true: 'La Palabra Larga' no es un palíndromo");
    }
    @Test
    void testPalindromoTilde() {
        assertTrue(checker.isPalindrome("reconocér"),
                "Debería ser true: palíndromo con tilde");
    }

    @Test
    void classicSentenceWithPunctuationAndSpaces_returnTrue() {
        assertTrue(checker.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void mixedCaseAndPunctuation_returnTrue() {
        assertTrue(checker.isPalindrome("No 'x' in Mixon"));
    }

    @Test
    void simpleWord_returnsTrue() {
        assertTrue(checker.isPalindrome("racesar"));
    }
}