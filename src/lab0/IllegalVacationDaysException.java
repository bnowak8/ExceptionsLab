
package lab0;


public class IllegalVacationDaysException extends Exception{
    private static final String MSG = "Not a valid vacation day value.";

    public IllegalVacationDaysException() {
        
    }

    public IllegalVacationDaysException(String message) {
        super(MSG);
    }

    public IllegalVacationDaysException(String message, Throwable cause) {
        super(MSG, cause);
    }

    public IllegalVacationDaysException(Throwable cause) {
        super(cause);
    }
    
    public final String getMessage(){
        return MSG;
    }
    
    public final String getLocalizedMessage(){
        return MSG;
    }
}
