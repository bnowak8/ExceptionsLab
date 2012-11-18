
package lab1.solution;

public class NoLastNameException extends Exception{
    
        
    private static final String MSG = "No last name!";


    public NoLastNameException() {
    }

    public NoLastNameException(String message) {
        super(MSG);
    }

    public NoLastNameException(String message, Throwable cause) {
        super(MSG, cause);
    }

    public NoLastNameException(Throwable cause) {
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
