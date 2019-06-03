package edu.cnm.deepdive;

public class Palindromes {

  public static boolean isPalindrome(String s){
    return isSimplePalindrome(s.replaceAll("\\W+", "").toLowerCase());
  }

  public static boolean isSimplePalindrome(String s){
    return s.length() <= 1
        || (s.charAt(0) == s.charAt(s.length() -1)
        && isSimplePalindrome(s.substring(1, s.length() -1))
    );
  }
}