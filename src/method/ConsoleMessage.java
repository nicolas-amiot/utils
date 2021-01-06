package method;

/* For Eclipse install the plugin "ANSI Escape in Console" */
/**
 * Console message color
 * @author Nicolas
 *
 */
public final class ConsoleMessage {
	
	/**
	 * Black console color
	 */
	public static final ConsolePrint bla = new ConsolePrint("30");
	
	/**
	 * Black console color
	 */
	public static final ConsolePrint red = new ConsolePrint("31");
	
	/**
	 * Black console color
	 */
	public static final ConsolePrint gre = new ConsolePrint("32");
	
	/**
	 * Black console color
	 */
	public static final ConsolePrint yel = new ConsolePrint("33");
	
	/**
	 * Black console color
	 */
	public static final ConsolePrint blu = new ConsolePrint("34");
	
	/**
	 * Black console color
	 */
	public static final ConsolePrint pur = new ConsolePrint("35");
	
	/**
	 * Black console color
	 */
	public static final ConsolePrint cya = new ConsolePrint("36");
	
	/**
	 * Black console color
	 */
	public static final ConsolePrint whi = new ConsolePrint("37");
	
	/**
	 * Private constructor
	 */
	private ConsoleMessage() {}
	
	public static class ConsolePrint {
		
		private String color;
		
		private static final String before = (char) 27 + "[";
		private static final String after = "m";
		
		private static final String reset = before + "0" + after;
		
		private ConsolePrint(String color) {
			this.color = before + color + after;
		}
		
		/**
		 * {@link java.io.PrintStream#println(String)}
		 */
		public void println(String str) {
			System.out.println(color + str + reset);
	    }
		
		/**
		 * {@link java.io.PrintStream#print(String)}
		 */
		public void print(String str) {
			System.out.print(color + str + reset);
	    }
		
	}

}
