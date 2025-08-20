package org.example;

public class MobilePhoneNumberValidator {

  public static boolean isValid(String inputNumber) {
    String pattern = "^(070|080|090)-\\\\d{4}-\\\\d{4}$";
    return inputNumber.matches(pattern);
  }
}
