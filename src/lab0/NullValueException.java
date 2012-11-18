
package lab0;


public class NullValueException extends Exception {
    
private static final String MSG = "Null Value present";

    public NullValueException() {
    }

    public NullValueException(String message) {
        super(MSG);
    }

    public NullValueException(String message, Throwable cause) {
        super(MSG, cause);
    }

    public NullValueException(Throwable cause) {
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
