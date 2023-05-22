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
public class lab3 {
    public static void main(String[] args) {
        try{
            System.out.println("statement1");
            System.out.println(1/0);
            System.out.println("statement3");
    }
        catch(ArithmeticException e){
        }
        finally {
            System.out.println("statement4");
        }
        System.out.println("statement5");
    }
}
