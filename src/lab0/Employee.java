package lab0;

import java.util.Date;
import java.util.Calendar;

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

/**
 * This is a domain object in the ExceptionsLab application, and represents a
 * simulation of a real world employee.
 * 
 * @author bnowak8
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    public static final int MIN_VACATION_DAYS = 0;
    public static final int MIN_MAX_SSN=9;
    private  Calendar minDate = Calendar.getInstance();
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacationAllowed;

    /**
     * Default constructor for the domain object Employee
     */
    public Employee() {
       
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacationAllowed = 0;
    }

    /**
     * Constructor for the domain object, sets Simulated Employees first and 
     * last name, ssn, hire date, and amount of vacation days allowed
     * 
     * @param firstName Employees first name, must be between 2 and 15 characters.
     * @param lastName Employees last name, must be between 2 and 15 characters.
     * @param ssn Employees Social Security Number, must be 9 characters long, no dashes.
     * @param hireDate Employees hire date Must be before current date and after companies start date
     * @param daysVacationAllowed Employees allowed vacation days must be between 0 and 15
     */
    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacationAllowed) throws NullValueException,IllegalNameException{
        if(firstName == null ||firstName.isEmpty() ||
           lastName == null ||lastName.isEmpty() ||
           ssn == null || ssn.isEmpty()||
           hireDate == null){
            throw new NullValueException();
            }
        
        try{
            if(firstName.length()<2 ||firstName.length()>15){
                throw new IllegalNameException();
            }else{
        this.firstName = firstName;
        this.lastName = lastName;
            }
            
        this.firstName = firstName;
        this.lastName = lastName;
        }catch(IllegalNameException nvEx){
            nvEx.getMessage();
        }
        
        try{
            if(ssn.length() == MIN_MAX_SSN){
                this.ssn = ssn;
            }else{
                throw new IllegalArgumentException();
            }
        }catch(IllegalArgumentException ilEx){
            ilEx.getMessage();
        }
        
        this.hireDate = hireDate;
        this.daysVacationAllowed = daysVacationAllowed;
    }
    
    /**
     * Returns the amount of vacation days allowed for the domain object Employee
     * 
     * @return Amount of vacation days allowed
     */
    public int getDaysVacationAllowed() {
        return daysVacationAllowed;
    }

    /**
     * Sets the number of vacation days allowed for an employee.
     * 
     * @param daysVacationAllowed 
     * @throws IllegalVacationDaysException If daysVacationAllowed < MIN_VACATION_DAYS || > MAX_VACATION_DAYS
     */
    public void setDaysVacationAllowed(int daysVacationAllowed) throws IllegalVacationDaysException{
        if(daysVacationAllowed < MIN_VACATION_DAYS || daysVacationAllowed >MAX_VACATION_DAYS){
            throw new IllegalVacationDaysException();
        }
        this.daysVacationAllowed = daysVacationAllowed;
    }

    /**
     * Returns the first name of the domain object Employee 
     * 
     * @return First name of Employee
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the First name of the domain object Employee
     * 
     * @param firstName The first name of the domain object Employee 
     */
    public void setFirstName(String firstName) {
        if(firstName == null||firstName.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
    }

    /**
     * Returns the hire date of the domain object Employee
     * 
     * @return hire date of the domain object Employee 
     */
    public Date getHireDate() {
        return hireDate;
    }

    /**
     * Sets the hire date of the domain object Employee
     * 
     * @param hireDate The hire date of the domain object Employee 
     */
    public void setHireDate(Date hireDate) {
        if(hireDate == null|| hireDate.before(hireDate))
        this.hireDate = hireDate;
    }

    /**
     * Returns the last name of the domain object Employee
     * 
     * @return Last name of the domain object Employee 
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the domain object Employee
     * 
     * @param lastName The last name of the domain object Employee 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the Social Security Number of the domain object Employee
     * 
     * @return The SSN of the domain object Employee 
     */
    public final String getSsn() {
        return ssn;
    }

    /**
    * Sets the Social Security Number of the domain object Employee
    * 
    * @param ssn The SSN of the domain object Employee 
    */
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
    
}
