/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

/**
 *
 * @author rbath1
 */
public class Startup {
    public static void main(String args[]) {
        Employee emp = new Employee();
        
        emp.setFirstName("");
        
        System.out.println(emp.getFirstName());
    }
}
