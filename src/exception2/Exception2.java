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
public class Exception2 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
try {
int[] list = new int[10];
System.out.println("list[10] is " + list[10]);
}
catch (ArithmeticException ex) {
System.out.println("ArithmeticException");
}
catch (RuntimeException ex) {
System.out.println("RuntimeException");
}
catch (Exception ex) {
System.out.println("Exception");
}
}
}
