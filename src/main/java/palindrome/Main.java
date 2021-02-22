package palindrome;

import java.util.Scanner;

import static palindrome.PalindromeValidation.prepareString;
import static palindrome.PalindromeValidation.verifyIfStringIsPalindrome;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputWord = "";
        do {
            System.out.println("Insira a palavra a ser verificada:");
            inputWord = scanner.nextLine();
        } while (inputWord.equals(""));

        System.out.println("A comparação deve ser case sentitive?");
        System.out.println("1 para sim / 2 para não ");

        boolean isCaseSensitive = scanner.nextInt() == 1;

        System.out.println("A comparação deve considerar espaços?");
        System.out.println("1 para sim / 2 para não ");

        boolean hasSpace = scanner.nextInt() == 1;

        String word = prepareString(inputWord, isCaseSensitive, hasSpace);

        System.out.println(verifyIfStringIsPalindrome(word));
    }
}
