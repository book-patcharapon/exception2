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
public class MyException extends Exception{
    public MyException(String str){
    super(str);
    }
    public MyException(){
    super();
    }
}
