/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception2;

/**
 *
 * @author book
 */
public class lab6 {
      public static void main(String[] args) {
    try {
      System.out.println(1 / 0);
    } catch (ArithmeticException exception) {
      exception.printStackTrace();
      System.out.println(exception.getMessage());
      System.out.println(exception.toString());
      StackTraceElement[] stack = exception.getStackTrace();
      for (int i = 0; i < stack.length; i++) {
        System.out.println(stack[i].getClassName());
        System.out.println(stack[i].getMethodName());
        System.out.println(stack[i].getFileName());
        System.out.println(stack[i].getLineNumber());
      }
    }
  }
}
