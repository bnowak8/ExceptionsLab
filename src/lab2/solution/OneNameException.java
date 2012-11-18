
package lab2.solution;

public class OneNameException extends Exception{
    
    private static final String MSG = "You only entered one name!";


    public OneNameException() {
    }

    public OneNameException(String message) {
        super(MSG);
    }

    public OneNameException(String message, Throwable cause) {
        super(MSG, cause);
    }

    public OneNameException(Throwable cause) {
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
