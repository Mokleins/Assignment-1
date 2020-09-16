/**
 * InvalidSequenceException.
 * 
 * @author Xylon Funes
 */
public class UnmatchedException extends RuntimeException {
	/**
     * Constructor.
     */
	public UnmatchedException() {
		super("The passwords do not match");
	}
	/**
	 * Constructor with String 
	 * @param message message
	 */
	public UnmatchedException(String message) {
		super(message);
	}
}
