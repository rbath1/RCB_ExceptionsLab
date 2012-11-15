package lab1.solution;

import java.awt.Window;
import lab1.*;
import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {
    private static final int LAST_NAME_IDX = 1;
    private String fullName;
    private String lastName;
    String[] nameParts;
        
   
    public String extractLastName(String fullName) throws NullPointerException, ArrayIndexOutOfBoundsException{
        for (int i=0;i < fullName.length();i++){
          if(Character.isWhitespace(fullName.charAt(i))){
             nameParts = fullName.split(" ");
          }
        }
        if(nameParts==null || nameParts.length < 1  ){
            throw new NullPointerException("Error: No last name (NullPointer). ");
        } else if (nameParts.length < 2){
            throw new ArrayIndexOutOfBoundsException("Error: No last name (ArrayIndexOutOfBounds).");
        } else {
        return nameParts[LAST_NAME_IDX];
        }
    
}
    public String getLastName(){
        return lastName;
    }
    public void errorMSG(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    public void setFullName() throws NullPointerException{
        fullName = JOptionPane.showInputDialog("Enter full name:");
        if (fullName == null || fullName.equals("")){
            throw new NullPointerException("Error. Name does not exist.");
        }
    }
    public void setLastName(String fullName) {
        this.extractLastName(fullName);   
        lastName = nameParts[LAST_NAME_IDX];  
        
    }
    
    public void displayLastName(){
        String msg = "Your last name is: " + this.getLastName();
        JOptionPane.showMessageDialog(null, msg);
    }
    public void doAll(){
        this.setFullName();
        this.setLastName(fullName);
        this.displayLastName();
    }
//    public void isLastNameValid(){
//       
//        for (int i=0;i < fullName.length();i++){
//          if(Character.isWhitespace(fullName.charAt(i))){
//            this.setLastName(fullName);
//          }          
//        }     
//    }

}
