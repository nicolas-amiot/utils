package method;

/**
 * String formatter
 * @author Nicolas
 *
 */
public class Formatter {
	
	/**
	 * Private constructor
	 */
	private Formatter() {}
	
	/**
	 * Capitalize method
	 * @param str
	 * @return
	 */
	public static String capitalize(String str) {
		if(str != null) {
			str = str.trim();
			if(str.length() > 1) {
				return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
			} else {
				return str.toUpperCase();
			}
		}
		return "";
	}
	
	/**
	 * Truncate method
	 * @param str
	 * @param lenght
	 * @return
	 */
	public static String truncate(String str, int lenght) {
		if(str != null) {
			if(str.length() > lenght) {
				if(lenght < 0) {
					lenght = str.length() + lenght;
				}
				return str.substring(0, lenght);
			}
			return str;
		}
		return "";
	}
	
	/**
	 * Check that the field contains something other than spaces
	 * @param str
	 * @return
	 */
	public static boolean isBlank(String str) {
		return str == null || str.trim().length() == 0;
	}

}
