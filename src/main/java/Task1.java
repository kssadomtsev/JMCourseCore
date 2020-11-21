package main.java;

public class Task1 {
    public static boolean isPalindromeCycle(String text) {
        String textOnlyAlphabeticAndDigit = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;
        int j = textOnlyAlphabeticAndDigit.length() - 1;
        while (i < j) {
            if (textOnlyAlphabeticAndDigit.charAt(i) != textOnlyAlphabeticAndDigit.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindrome(String text) {
        String textOnlyAlphabeticAndDigit = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedText = String.valueOf(new StringBuilder(textOnlyAlphabeticAndDigit).reverse());
        return textOnlyAlphabeticAndDigit.equals(reversedText);
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeCycle("Was it a cat I saw?"));
        System.out.println(isPalindromeCycle("TAT"));
        System.out.println(isPalindromeCycle("T"));
        System.out.println(isPalindromeCycle("A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10801."));
        System.out.println(isPalindrome("Was it a cat I saw?"));
        System.out.println(isPalindrome("TAT"));
        System.out.println(isPalindrome("T"));
        System.out.println(isPalindrome("A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10801."));

    }
}
