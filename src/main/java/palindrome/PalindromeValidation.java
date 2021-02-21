package palindrome;

import java.util.function.Function;


/**
 * Class responsible for implementing the verification of palindromes
 *
 * @author Laryssa Yumi - laryyumi@gmail.com
 */
public class PalindromeValidation {

    public static final String ITS_PALINDROME_MESSAGE = "A string é um palíndromo.";

    public static final String ITS_NOT_PALINDROME_MESSAGE = "A string não é um palíndromo.";

    static Function<String, String> reverse = word -> new StringBuilder(word).reverse().toString();

    /**
     * <p>Method that checks whether a word is a palindrome or not.
     * </p>
     *
     * @param word word to be verified
     * @return message confirming whether it is palindrome or not
     * @since 1.0
     */
    public static String verifyIfStringIsPalindrome(String word) {
        String reversedWord = reverse.apply(word);

        if (reversedWord.equals(word)) {
            return ITS_PALINDROME_MESSAGE;
        }

        return ITS_NOT_PALINDROME_MESSAGE;
    }

    /**
     * <p>Method that prepares the string according to the comparison arguments.
     * If the comparison is case sensitive, the string is not modified, otherwise it is changed to uppercase.
     * If the comparison is without spaces, the string must be returned without spaces, otherwise it will not be modified.
     * </p>
     *
     * @param word            word to be verified
     * @param isCaseSensitive signals whether the comparison is case sensitive
     * @param hasSpace        signals whether the comparison should include spaces
     * @return string modified according to the comparison arguments.
     * @since 1.0
     */
    public static String prepareString(String word, boolean isCaseSensitive, boolean hasSpace) {
        String convertedString = word;

        if (!isCaseSensitive) {
            convertedString = convertedString.toUpperCase();
        }

        if (!hasSpace) {
            convertedString = convertedString.replaceAll(" ", "");
        }

        return convertedString;
    }
}
