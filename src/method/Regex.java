package method;

import java.util.regex.Pattern;

/**
 * Regex class
 * @author Nicolas
 *
 */
public class Regex {
	
	/**
	 * Private constructor
	 */
	private Regex() {}
	
	/**
	 * Simple email regex
	 * @param email
	 * @return
	 */
	public static boolean emailSimpleValidation(String email) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(email.trim()).matches();
	}
	
	/**
	 * Email regex
	 * @param email
	 * @return
	 */
	public static boolean EmailValidation(String email) {
		String regex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(email).matches();
	}
	
	/**
	 * General Email Regex (RFC 5322 Official Standard)
	 */
	public static boolean emailRfcValidation(String email) {
		String regex = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(email).matches();
	}
	
	/**
	 * Phone regex
	 * @param number
	 * @return
	 */
	public static boolean internationalPhoneNumberValidation(String number) {
		String regex = "^\\+(?:[0-9]\\s?){6,14}[0-9]$";
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(number).matches();
	}
	
	/**
	 * Date regex
	 * @param date
	 * @return
	 */
	public static boolean dateFormatValidation(String date) {
		String regex = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/[0-9]{4}$";
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(date).matches();
	}
	
	/**
	 * Login regex
	 * @param login
	 * @return
	 */
	public static boolean loginValidation(String login) {
		String regex = "^[a-z0-9_-]{5,20}$";
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(login).matches();
	}
	
	/*
	 *	(?=.*d)				: This matches the presence of at least one digit from 0-9.
	 *	(?=.*[a-z])			: This matches the presence of at least one lowercase letter.
	 *	((?=.*[A-Z])		: This matches the presence of at least one capital letter.
	 *	(?=.*[@#$%&!?;:*])	: This matches the presence of at least one special character.
	 *	{6,16}				: This limits the length of password from minimum 8 letters to maximum 20 letters.
	 */
	/**
	 * Password regex
	 * @param password
	 * @return
	 */
	public static boolean passwordValidation(String password) {
		String regex = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&!?;:*]).{8,20})";
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(password).matches();
	}

}
