package method;

import java.text.DateFormatSymbols;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Temporal class
 * @author Nicolas
 *
 */
public class Temporal {
	
	/**
	 * Seconds
	 */
	public static final String SECONDS = "seconds";
	
	/**
	 * Minutes
	 */
	public static final String MINUTES = "minutes";
	
	/**
	 * Hours
	 */
	public static final String HOURS = "hours";
	
	/**
	 * Days
	 */
	public static final String DAYS = "days";
	
	/**
	 * Months
	 */
	public static final String MONTHS = "months";
	
	/**
	 * Years
	 */
	public static final String YEARS = "years";
	
	/**
	 * Total days
	 */
	public static final String TOTAL_DAYS = "totalDays";
	
	/**
	 * Private constructor
	 */
	private Temporal() {}
	
	/**
	 * Get List of months
	 * @param locale
	 * @return
	 */
	public static String[] listOfMonths(Locale locale) {
		String[] months = new String[12];
		String[] months13 = DateFormatSymbols.getInstance(locale).getMonths();
		for (int i = 0; i < 12; i++) {
			months[i] = months13[i].substring(0, 1).toUpperCase() + months13[i].substring(1).toLowerCase();
		}
		return months;
	}
	
	/**
	 * Get list of days
	 * @param locale
	 * @return
	 */
	public static String[] listOfDays(Locale locale) {
		String[] days = new String[7];
		String[] days8 = DateFormatSymbols.getInstance(locale).getWeekdays();
		for (int i = 0; i < 6; i++) {
			days[i] = days8[i+2].substring(0, 1).toUpperCase() + days8[i+2].substring(1).toLowerCase();;
		}
		days[6] = days8[1].substring(0, 1).toUpperCase() + days8[1].substring(1).toLowerCase();
		return days;
	}
	
	/**
	 * Get time passed
	 * @param oldDate
	 * @param newDate
	 * @return
	 */
	public static Map<String, Integer> timePassed(LocalDateTime oldDate, LocalDateTime newDate) {
		Duration duration = Duration.between(oldDate, newDate);
		Period period = Period.between(oldDate.toLocalDate(), newDate.toLocalDate());
		Map<String, Integer> time = new HashMap<>();
		time.put(SECONDS, (int) duration.getSeconds() % 60);
		time.put(MINUTES, (int) duration.getSeconds() / 60 % 60);
		time.put(HOURS, (int) duration.getSeconds() / 3600 % 60);
		time.put(DAYS, period.getDays());
		time.put(MONTHS, period.getMonths());
		time.put(YEARS, period.getYears());
		time.put(TOTAL_DAYS, (int) duration.toDays());
		return time;
	}
	
	/**
	 * Check if the day exists
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	public static boolean dayExist(int year, int month, int day) {
		LocalDate date = LocalDate.of(year, month, 1);
		if(day <= date.lengthOfMonth()){
			return true;
		}
		return false;
	}

}
