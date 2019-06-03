package edu.cnm.deepdive;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromesTest {

  @Test
  public void isPalindrome() {
    assertTrue(Palindromes.isPalindrome("A man, a plan, a canal - Panama!"));
    assertFalse(Palindromes.isPalindrome("Not a palindrome"));
    assertTrue(Palindromes.isPalindrome("racecar"));
  }
}