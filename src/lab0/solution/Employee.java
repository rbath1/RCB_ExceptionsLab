package lab0.solution;

import lab0.*;
import java.util.Date;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    public static final int MIN_VACATION_DAYS = 0;
    public static final String VACATION_ERR_MSG = "Only values 0 - 28 permitted for vacation";
    public static final String NULL_ERR_MSG = "Object is null";
    public static final String NUMERIC_ERR_MSG = "Name cannot be a number";
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.hireDate = hireDate;
        this.daysVacation = daysVacation;
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }
/**
 * Sets number of vacation days allotted for employee (or remaining)
 * 
 * @param daysVacation - days of vacation allowed per year
 * @throws IllegalArgumentException - if value not in range of 0 and 28 
 */
    public void setDaysVacation(int daysVacation) throws IllegalArgumentException {
        if(daysVacation < MIN_VACATION_DAYS || daysVacation > MAX_VACATION_DAYS){
            throw new IllegalArgumentException(VACATION_ERR_MSG);
        } 
            this.daysVacation = daysVacation;
        
    }
/** 
 * 
 * @return first name of employee object
 */
    public String getFirstName() {
        return firstName;
    }
    /**Sets first name of the Employee
    * 
    * @param firstName - first name of employee being entered
    * @throws IllegalArgumentException - checks input for empty string and null
    */
    public void setFirstName(String firstName) throws IllegalArgumentException {
        
        //check for null THEN length
        if(firstName == null || firstName.length() == 0 || (isNumeric(firstName))){
            throw new IllegalArgumentException(NUMERIC_ERR_MSG);
        } 
        this.firstName = firstName;
    }
/**
 * 
 * @return Hire date of employee object. 
 */
    public Date getHireDate() {
        return hireDate;
    }
    /**Sets the hire date of the employee object
     * 
     * @param hireDate - Date of hire for employee being entered
     * @throws IllegalArgumentException  - checks date for null
     */
    public void setHireDate(Date hireDate) throws IllegalArgumentException {
        Date today = new Date();
        if (hireDate == null || hireDate.after(today)){
            throw new IllegalArgumentException("Date is Null");
        }
        this.hireDate = hireDate;
    }
/**
 * 
 * @return Last name of employee object.
 */
    public String getLastName() {
        return lastName;
    }

    /**Sets last name of the employee object.
     * 
     * @param lastName - Last name of the employee object
     * @throws IllegalArgumentException - Check last name for null and empty string
     */
    public void setLastName(String lastName) throws IllegalArgumentException{
        if(lastName == null || lastName.equals("") || isNumeric(lastName)){
            throw new IllegalArgumentException("Last name cannot be null/empty");
        }
        this.lastName = lastName;
    }
/**
 * 
 * @return Social security number of employee object. 
 */
    public final String getSsn() {
        return ssn;
    }
    /**Sets the social security number of the employee object
     * 
     * @param ssn - Social security number of the employee object
     * @throws IllegalArgumentException - checks ssn for null, empty string, format, and if it is a numeric value.
     */
    public void setSsn(String ssn) throws IllegalArgumentException {
        if (ssn == null || ssn.equals("") || ssn.length() < 9 || ssn.length() > 9){
            throw new IllegalArgumentException("SSN out of format. Please use format XXXXXXXXX (no dashes).");
        } else if(this.isNumeric(ssn) == false){
            throw new IllegalArgumentException("SSN entered is not a number");
        }
        this.ssn = ssn;
    }
    
    
    /** Boolean method checks if input is a numeric string value
     * 
     * @param input - String input to be checked for numeric value
     * @return - returns true if is numeric value, else returns false
     */
    private boolean isNumeric(String input){
        try {  
            Integer.parseInt(input);  
         return true;  
        }  
        catch(Exception e) {  
         return false;  
        }  
    }
    
}
