/**
 * InvalidSequenceException.
 * 
 * @author Xylon Funes
 */
public class NoUpperAlphaException extends RuntimeException {
	/**
     * Constructor.
     */
	public NoUpperAlphaException() {
		super("The password must contain at least one uppercase alphabetic character");
	}
	/**
	 * Constructor with String 
	 * @param message message
	 */
	public NoUpperAlphaException(String message) {
		super(message);
	}
}
