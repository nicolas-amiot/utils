import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Map;

import method.ConsoleMessage;
import method.Encryptor;
import method.Number;
import method.Regex;
import method.Temporal;

public class Test {

	public static void main(String[] args) {
		ConsoleMessage.blu.println("Test");
		String[] t = Temporal.listOfDays(Locale.FRANCE);
		for (int i = 0; i < t.length; i++) {
			System.out.println("Test : " + t[i]);
		}
		System.out.println(Number.convertStringToInt("1 000"));
		System.out.println(Encryptor.encode("coucou", Encryptor.MD5));
		Map<String, Integer> interval = Temporal.timePassed(LocalDateTime.of(2001, 1, 27, 0, 0, 0), LocalDateTime.of(2002, 3, 4, 4, 3, 2));
		System.out.println(interval.get(Temporal.DAYS));
		System.out.println(Temporal.dayExist(2000, 2, 29));
		System.out.println(Regex.passwordValidation("123Soleil*"));
		System.out.println(Regex.dateFormatValidation("03/2/2000"));
	}

}
