package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AppTest {
  @Test
  public void addShouldReturnCorrectSum() {
    Calculator calculator = new Calculator();
    int result = calculator.add(5, 3);
    assertEquals(8, result);
  }

  @Test
  void shouldThrowExceptionWhenDividingByZero() {
    Calculator calculator = new Calculator();
    assertThrows(ArithmeticException.class, () -> {
      calculator.divide(10, 0);
    });
  }
}
