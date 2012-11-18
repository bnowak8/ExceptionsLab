
package lab3.solution;

public class NoNameException extends Exception{
    
    private static final String MSG = "You did not enter a name!";


    public NoNameException() {
    }

    public NoNameException(String message) {
        super(MSG);
    }

    public NoNameException(String message, Throwable cause) {
        super(MSG, cause);
    }

    public NoNameException(Throwable cause) {
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
