package method;

/**
 * Number class
 * @author Nicolas
 *
 */
public class Number {
	
	/**
	 * Private constructor
	 */
	private Number() {}
	
	/**
	 * String to short
	 * @param str
	 * @return
	 */
	public static short convertStringToShort(String str) {
		try {
			return Short.parseShort(str.replaceAll("\\s",""));
		} catch (NumberFormatException e) {
			return 0;
		}
	}
	
	/**
	 * String to int
	 * @param str
	 * @return
	 */
	public static int convertStringToInt(String str) {
		try {
			return Integer.parseInt(str.replaceAll("\\s",""));
		} catch (NumberFormatException e) {
			return 0;
		}
	}
	
	/**
	 * String to long
	 * @param str
	 * @return
	 */
	public static long convertStringToLong(String str) {
		try {
			return Long.parseLong(str.replaceAll("\\s",""));
		} catch (NumberFormatException e) {
			return 0;
		}
	}
	
	/**
	 * String to float
	 * @param str
	 * @return
	 */
	public static float convertStringToFloat(String str) {
		try {
			return Float.parseFloat(str.replaceAll("\\s","").replace(",", "."));
		} catch (NumberFormatException e) {
			return 0;
		}
	}
	
	/**
	 * String to double
	 * @param str
	 * @return
	 */
	public static double convertStringToDouble(String str) {
		try {
			return Double.parseDouble(str.replaceAll("\\s","").replace(",", "."));
		} catch (NumberFormatException e) {
			return 0;
		}
	}

}
