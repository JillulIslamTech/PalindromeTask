package com.sparta.ji;

public class Palindrome {

    public boolean isPalindrome(String word){

        String reverseWord = "";

        for (int i = word.length()-1; i>=0; i--){
            reverseWord = reverseWord + word.charAt(i);
        }
        if (word.equals(reverseWord)) {
            return true;
        } else {
            return false;
        }
    }
}

