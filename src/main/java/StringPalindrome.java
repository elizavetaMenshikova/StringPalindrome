//String Palindrome
//You need to write a simple Java program to check if a given String is palindrome or not.
// A Palindrome is a String which is equal to the reverse of itself, e.g.,
// "Bob" is a palindrome because of the reverse of "Bob" is also "Bob."
// Though be prepared with both recursive and iterative solution of this problem.
// The interviewer may ask you to solve without using any library method,
// e.g. indexOf() or subString() so be prepared for that.

import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {
        System.out.println("Введите слово: ");
        Scanner scanner = new Scanner(System.in);
        char[] charArrayWord = scanner.nextLine().toCharArray();
        System.out.println(isPalindrome(charArrayWord));
    }

    public static boolean isPalindrome(char[] word) {
        for (int i = 0, j = word.length - 1; i < word.length / 2; i++, j--) {
            if (Character.toLowerCase(word[i]) != Character.toLowerCase(word[j])) {
                return false;
            }
        }
        return true;
    }

}
