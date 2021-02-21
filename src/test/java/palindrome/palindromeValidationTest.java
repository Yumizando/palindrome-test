package palindrome;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static palindrome.PalindromeValidation.*;

class palindromeValidationTest {

    private static String palindrome, notPalindrome, palindromeWithSpaces;

    @BeforeAll
    public static void setup(){
        palindrome = "aibofobia";
        notPalindrome = "calopsita";
        palindromeWithSpaces = " aibo f obia ";
    }

    @Test
    void shouldReturnItsPalindromeMessageGivenWordWhenVerifyPalindrome() {
        String returnMessage = verifyIfStringIsPalindrome(palindrome);

        assertNotNull(returnMessage, "Should not be null.");
        assertEquals(ITS_PALINDROME_MESSAGE, returnMessage);
    }

    @Test
    void shouldReturnItsNotPalindromeMessageGivenWordWhenVerifyPalindrome() {
        String returnMessage = verifyIfStringIsPalindrome(notPalindrome);

        assertNotNull(returnMessage, "Should not be null.");
        assertEquals(ITS_NOT_PALINDROME_MESSAGE, returnMessage);
    }

    @Test
    void shouldReturnCaseSensitiveStringWithSpacesWhenPrepareString() {
        String convertedString = prepareString(palindromeWithSpaces, true, true);

        assertNotNull(convertedString, "Should not be null.");
        assertEquals(palindromeWithSpaces, convertedString);
    }

    @Test
    void shouldReturnCaseSensitiveStringWithoutSpacesWhenPrepareString() {
        String convertedString = prepareString(palindromeWithSpaces, true, false);

        assertNotNull(convertedString, "Should not be null.");
        assertEquals(palindrome, convertedString);
    }

    @Test
    void shouldReturnUpperCaseStringWithSpacesWhenPrepareString() {
        String convertedString = prepareString(palindromeWithSpaces, false, true);

        assertNotNull(convertedString, "Should not be null.");
        assertEquals(palindromeWithSpaces.toUpperCase(), convertedString);
    }

    @Test
    void shouldReturnUpperCaseStringWithoutSpacesWhenPrepareString() {
        String convertedString = prepareString(palindromeWithSpaces, false, false);

        assertNotNull(convertedString, "Should not be null.");
        assertEquals(palindrome.toUpperCase(), convertedString);
    }

}