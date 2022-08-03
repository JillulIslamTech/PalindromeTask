package com.sparta.ji;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    @DisplayName(" Verify adam is not palindrome")
    public void verifyWordIsNotPalindrome(){
        Palindrome reverse = new Palindrome();
        System.out.println(reverse.isPalindrome("mdam"));
    }

    @Test
    @DisplayName(" Verify madam is not palindrome")
    public void verifyWordIsPalindrome(){
        Palindrome reverse = new Palindrome();
        System.out.println(reverse.isPalindrome("madam"));
    }
}
