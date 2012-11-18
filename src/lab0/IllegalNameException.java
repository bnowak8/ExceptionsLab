
package lab0;

/**
 * Exception for invalid First Name
 * 
 * @author bnowak8
 */
public class IllegalNameException extends Exception{
    
    private static final String MSG = "Not a valid First Name.";


    public IllegalNameException() {
    }

    public IllegalNameException(String message) {
        super(MSG);
    }

    public IllegalNameException(String message, Throwable cause) {
        super(MSG, cause);
    }

    public IllegalNameException(Throwable cause) {
        super(cause);
    }
        
    @Override
    public final String getMessage(){
        return MSG;
    }
    
    @Override
    public final String getLocalizedMessage(){
        return MSG;
    }
    
    
}
