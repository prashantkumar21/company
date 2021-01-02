/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

/**
 *
 * @author Prashant Sharma
 */
public class Main {
 public static void main(String args[]){
   Company comp = new Company();
     
   Producer p = new Producer(comp);
   p.start();
   Consumer co= new Consumer(comp);
   co.start();
 }   
}
