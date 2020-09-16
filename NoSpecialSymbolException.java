/**
 * InvalidSequenceException.
 * 
 * @author Xylon Funes
 */	
public class NoSpecialSymbolException extends RuntimeException {
	/**
     * Constructor.
     */
	public NoSpecialSymbolException() {
        super("The password must contain at least one special symbol");
    }
	/**
     * Constructor with String.
     * 
     * @param message message
     */
    public NoSpecialSymbolException(String message) {
        super(message);
    }
}
