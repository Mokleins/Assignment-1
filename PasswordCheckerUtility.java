/**
 * 
 * @author Xylon Funes
 * @apiNote Assignment 1
 * 
 *
 */
public class PasswordCheckerUtility {
	/**
	 * Return true if valid password (follows all rules from above), returns false
	 * if an invalid password
	 */
	public static boolean isValidPassword(String passwordString) throws LengthException, NoDigitException,
			NoUpperAlphaException, NoLowerAlphaException, InvalidSequenceException, NoSpecialSymbolException {
		if (passwordString.length() < 6) {
			throw new LengthException();
		}
		boolean number = false;
		for (int i = 0; i < passwordString.length(); i++) {
			char P = passwordString.charAt(i);
			if (Character.isDigit(P)) {
				number = true;
				break;
			}
		}
		if (number == false) {
			throw new NoDigitException();
		}
		boolean Upper = false;
		for (int i = 0; i < passwordString.length(); i++) {
			char P = passwordString.charAt(i);
			if (Character.isUpperCase(P)) {
				Upper = true;
				break;
			}
		}
		if (Upper == false) {
			throw new NoUpperAlphaException();
		}
		boolean Lower = false;
		for (int i = 0; i < passwordString.length(); i++) {
			char P = passwordString.charAt(i);
			if (Character.isLowerCase(P)) {
				Lower = true;
				break;
			}
		}
		if (Lower == false) {
			throw new NoLowerAlphaException();
		}
		boolean Special = false;
		for (int i = 0; i < passwordString.length(); i++) {
			char P = passwordString.charAt(i);
			if (!Character.isDigit(P) && !Character.isLetter(P) && !Character.isWhitespace(P)) {
				Special = true;
				break;
			}
		}
		if (Special == false) {
			throw new NoSpecialSymbolException();
		}
		
		for (int i = 0; i < passwordString.length() - 2; i++) {
			String substring = passwordString.substring(i, i + 3);
			char a = substring.charAt(0);
			char b = substring.charAt(1);
			char c = substring.charAt(2);
			if (a == b & a == c) {
				throw new InvalidSequenceException();
			}
		}
		return true;
	}

	/**
	 * Return true if length of password is greater or equal to 6 but less than or
	 * equal to 9
	 */
	public static boolean isWeakPassword(java.lang.String passwordString) {
		if (passwordString.length() >= 6 && passwordString.length() <= 9) {
			return true;
		}
		return false;
	}

	/**
	 * Returns an arraylist of invalid passwords (weak passwords are not considered
	 * invalid)
	 */
	public static java.util.ArrayList<java.lang.String> getInvalidPasswords(
			java.util.ArrayList<java.lang.String> passwords) {
		java.util.ArrayList<String> password = new java.util.ArrayList<String>();
		for (int i = 0; i < passwords.size(); i++) {
			try {
				isValidPassword(passwords.get(i));
			} catch (Exception exception) {
				password.add(passwords.get(i) + " " + exception.getMessage());
			}
		}
		return password;
	}
}
