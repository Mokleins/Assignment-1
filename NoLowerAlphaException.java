/**
 * InvalidSequenceException.
 * 
 * @author Xylon Funes
 */
public class NoLowerAlphaException extends RuntimeException {
	/**
     * Constructor.
     */
	public NoLowerAlphaException() {
        super("The password must contain at least one lowercase alphabetic character");
    }
	/**
     * Constructor with String.
     * 
     * @param message message
     */
    public NoLowerAlphaException(String message) {
        super(message);
    }
}
