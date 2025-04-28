import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    private PalindromeChecker checker;  // Campo para almacenar la instancia

    @BeforeEach
    void setUp() {
        // Arrange
        checker = new PalindromeChecker();  // Asignar al campo de la clase
    }

    // Act
    @Test
    void testClassicSentenceWithPunctuationAndSpaces_returnsTrue() {
        assertTrue(checker.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void mixedCaseAndPunctuation_returnsTrue() {
        assertTrue(checker.isPalindrome("No 'x' in Nixon"));
    }

    @Test
    void simpleWord_returnsTrue() {
        assertTrue(checker.isPalindrome("racecar"));
    }
    @Test
    void numericPalindrome_returnsTrue() {
        assertTrue(checker.isPalindrome("12321"));
    }

    @Test
    void nonPalindromeSentence_returnsFalse() {
        assertFalse(checker.isPalindrome("Hello, world!"));
    }

    @Test
    void emptyString_returnsTrue() {
        assertTrue(checker.isPalindrome(""));
    }

    @Test
    void onlyNonAlphanumericCharacters_returnsTrue() {
        assertTrue(checker.isPalindrome("!!!... ---"));
    }

    @Test
    void singleCharacter_returnsTrue() {
        assertTrue(checker.isPalindrome("x"));
    }

    @Test
    void nullInput_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> checker.isPalindrome(null));
    }
    @Test
    void  stingOneCaracterRemoved(){
        assertTrue(checker.isPalindrome("@"));
    }
}
