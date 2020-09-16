/**
 * InvalidSequenceException.
 * 
 * @author Xylon Funes
 */
public class LengthException extends RuntimeException {
	/**
     * Constructor.
     */
	 public LengthException() {
	        super("The password must be at least 6 characters long.");
	    }
	 /**
     * Constructor with String.
     * 
     * @param message message
     */
    public LengthException(String message) {
        super(message);
    }
}
