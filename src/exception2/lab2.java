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
public class lab2 {
    public static void main(String[] args) {
        int[] list = new int[10];
        try {System.out.println("list[10] is " + list[10]);
        }
        catch(ArithmeticException e){System.out.println("ArithmeticException");
        }
        catch(RuntimeException e){System.out.println("run time exception");
        }
        catch(Exception e){System.out.println("Exception");
        }
    }
}