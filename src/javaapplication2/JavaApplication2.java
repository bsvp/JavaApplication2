/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
////
package javaapplication2;
import java.io.*;

/**
 *
 * @author Apalya
 */
class PingPong2 {
 synchronized void hit(long n) {
  for(int i = 1; i < 3; i++)
 System.out.print(n + "-" + i + " ");
 }
 }
public class JavaApplication2 implements Runnable {
static PingPong2 pp2 = new PingPong2();
 public static void main(String[] args) {
 new Thread(new JavaApplication2()).start();
new Thread(new JavaApplication2()).start();
}
public void run() { 
    pp2.hit(Thread.currentThread().getId());
}
}
