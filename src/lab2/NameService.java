package lab2;

import javax.swing.JOptionPane;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    private static final int FIRST_NAME_IDX = 0;
    private static final int LAST_NAME_IDX = 1;
    String[] nameParts;
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     */
    public String extractLastName(String fullName) throws NullPointerException, ArrayIndexOutOfBoundsException{
        for (int i=0;i < fullName.length();i++){
          if(Character.isWhitespace(fullName.charAt(i))){
             nameParts = fullName.split(" ");
          }
        }
        if(nameParts==null){
            throw new NullPointerException("Error: No last name (NullPointer).");
        } else if (nameParts.length < 2){
            throw new ArrayIndexOutOfBoundsException("Error: No last name (ArrayIndexOutOfBounds).");
        } else {
        return nameParts[LAST_NAME_IDX];
        }
    
}
    /**
     * Finds and returns the first name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the first name
     */
    public String extractFirstName(String fullName)  throws NullPointerException, ArrayIndexOutOfBoundsException{
        for (int i=0;i < fullName.length();i++){
          if(Character.isWhitespace(fullName.charAt(i))){
             nameParts = fullName.split(" ");
          }
        }
        if(nameParts==null){
            throw new NullPointerException("Error: No last name (NullPointer). ");
        } else if (nameParts.length < 1){
            throw new ArrayIndexOutOfBoundsException("Error: No last name (ArrayIndexOutOfBounds).");
        } else {
        return nameParts[FIRST_NAME_IDX];
        }
    
}

    /**
     * Gets the length of a name.
     * 
     * @param name - any full name or part of a name.
     * @return the length of the name or part.
     */
    public int getNameLength(String name) throws IllegalArgumentException {
        if(name == null || name.equals("")){
            throw new IllegalArgumentException("Name cannot be Empty");
        } 
        return name.length();
    }
    public void errorMSG(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}
