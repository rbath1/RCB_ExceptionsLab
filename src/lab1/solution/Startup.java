/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.solution;

/**
 *
 * @author rbath1
 */
public class Startup {
     public static void main(String[] args) {
       Challenge1 one = new Challenge1();
       
       try{
           one.doAll();
       } catch (NullPointerException npe){
           
           one.errorMSG(npe.getMessage());
          // System.out.println("E2 null");
           
       }catch (ArrayIndexOutOfBoundsException ibe){
           one.errorMSG(ibe.getMessage());
          // System.out.println("E1");
  
       } 
    }
}
