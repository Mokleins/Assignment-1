/**
 * InvalidSequenceException.
 * 
 * @author Xylon Funes
 */
public class NoDigitException extends RuntimeException {
	/**
     * Constructor.
     */
	public NoDigitException() {
        super("The password must contain at least one digit.");
    }
	/**
     * Constructor with String.
     * 
     * @param message message
     */
    public NoDigitException(String message) {
        super(message);
    }
}
