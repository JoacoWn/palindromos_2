import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class esPalindromoTest {

    private esPalindromo palindromo;

    @BeforeEach
    void setup(){palindromo = new esPalindromo();}

    @Test
    void classicSentenceWithPunctuationAndSpaces_returnsTrue() {
        assertTrue(palindromo.isPalindrome("A man, a plan, a canal: Panama"));
    }
    @Test
    void mixedCaseAndPunctuation_returnsTrue() {
        assertTrue(palindromo.isPalindrome("no 'x' in Nixon"));
    }
    @Test
    void StringOneCaracterRemoved(){
        assertTrue(palindromo.isPalindrome("¨@"));
    }
    @Test
    void emptyString_returnsTrue() {
        assertTrue(palindromo.isPalindrome(" "));
    }
    @Test
    void singleCharacter_returnsTrue() {
        assertTrue(palindromo.isPalindrome("x"));
    }

}
