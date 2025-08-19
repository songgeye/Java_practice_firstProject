package org.example;

public class PhoneNumberValidator {

  public static boolean isValid(String inputNumber) {
    String pattern = "^0\\d{2}-\\d{4}-\\d{4}$";
    return inputNumber.matches(pattern);
  }
}
