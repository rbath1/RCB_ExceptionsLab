package lab3.solution;

import lab3.*;

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
    private String[] nameParts;
    
    /**
     * Finds and returns the last name from within a full name
     * 
     * @param fullName - name containing a first name and last name
     * @return the last name
     * @throws IndexOutOfBoundsException - handled in InputOutputGui, checks if array index exists
     */
    public String extractLastName(String fullName) throws ArrayIndexOutOfBoundsException, NullPointerException,  InvalidNameException {
        for (int i=0;i < fullName.length();i++){
          if(Character.isWhitespace(fullName.charAt(i))){
             nameParts = fullName.split(" ");
          }
        }
        if(nameParts==null){
            throw new InvalidNameException("Error:No last name (InvalidNameException).");
        } else if (nameParts.length < 2){
            throw new ArrayIndexOutOfBoundsException("Error: No last name (ArrayOutOfBounds).");
        }
        else{
        return nameParts[LAST_NAME_IDX];
        }
    }
    
    /**
     * Finds and returns the first name from within a full name. 
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the first name
     * @throws IndexOutOfBoundsException - handled in InputOutputGui, checks if array index exists
     */
    public String extractFirstName(String fullName) throws ArrayIndexOutOfBoundsException, NullPointerException,  InvalidNameException  {
        for (int i=0;i < fullName.length();i++){
          if(Character.isWhitespace(fullName.charAt(i))){
             nameParts = fullName.split(" ");
          }
        }
        if(nameParts == null || nameParts.length < 2){
            throw new InvalidNameException("Error:No first name.");
        } else if(nameParts.length < 2){
            throw new ArrayIndexOutOfBoundsException("No first name (ArrayOutOfBounds).");
        }
        else {
        return nameParts[FIRST_NAME_IDX];
        }
    }

    /**
     * Gets the length of a name.
     * 
     * @param name - any full name or part of a name.
     * @return the length of the name or part.
     * @throws IllegalArgumentExeption - check for empty String, handled in InputOutputGui
     * @throws NullPointerException - check for null entry, handled in InputOutputGui
     */
    public int getNameLength(String name) throws InvalidNameException {
        if(name == null || name.equals("")){
            throw new InvalidNameException("Name cannot be Empty (InvalidName)");
        } 
        return name.length();
    }
    
}
