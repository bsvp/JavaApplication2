/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.io.*;
/**
 *
 * @author Apalya
 */
public class Threads2 implements Runnable {

@Override
public void run() {
     System.out.println("run.");

throw new RuntimeException("Problem");
}
public static void main(String[] args) {
Thread t = new Thread(new Threads2());
 t.start();
 System.out.println("End of method.");
 }
}


