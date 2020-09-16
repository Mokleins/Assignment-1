/**
 * InvalidSequenceException.
 * 
 * @author Xylon Funes
 */
public class InvalidSequenceException extends RuntimeException {

    /**
     * Constructor.
     */
    public InvalidSequenceException() {
        super("The password cannot contain more than two of the same character in sequence.");
    }

    /**
     * Constructor with String.
     * 
     * @param message message
     */
    public InvalidSequenceException(String message) {
        super(message);
    }

}