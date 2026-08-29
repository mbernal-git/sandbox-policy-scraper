package com.example;

/**
 * The main class for the application.
 */
public class App {

  /**
   * The main method for the application.
   *
   * @param args the command-line arguments
   */
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    System.out.println("Addition: " + calculator.add(5, 3));
  }
}
