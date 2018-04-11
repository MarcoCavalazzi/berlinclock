package com.catalyst.interviews.berlinclock;

// Public class that implements the method "convertTime", which returns the time in a BerlinClock-format.
public class BerlinClock extends Clock implements TimeConverter{
	private boolean debug = false;	// Variable used to activate or deactivate debugging I/O statements.
	
	@Override
	/* Function that input: time, string that contains the time of the day formatted like 23:59:59. */
	public String convertTime(String time) {
		if(debug) {
			System.out.println("_______________");
			System.out.println("Input time: "+time);
		}
		
		// Reading the components of the input string
		int seconds = getSeconds(time);
		int hours = getHours(time);
		int minutes  = getMinutes(time);
		
		String res = "";	// The output string with the BerlinClock time.
		// Converting the seconds while creating the first row of the BerlinClock.
		if(seconds % 2 == 0) {
			res += "Y";
		}else {
			res += "O";
		}
		res += "\n";
		
		// Converting the hours
		res += divideByFive(hours, 4, "R");	// Creating the second row of lights
		res += divideByOne(hours%5, 4, "R", "\n");	// Creating the third row of lights
		
		// Converting the minutes
		res += convertMinutesByFive(minutes, 11);	// Creating the fourth row of lights
		res += divideByOne(minutes%5, 4, "Y", "");	// Creating the fifth row of lights
		
		if(debug) System.out.println(res);
		
		return  res;
	}
	
	/**
	 * Function used to convert normal time in BerlinClock-time for the second and fourth rows.
	 * @param time is the number to convert in BerlinClock-time
	 * @param length is the length of the row of light in the BerlinClock
	 * @param symbol is the symbol we will use to signal that a light is on
	 * @return the string with the BerlinClock row of lights
	 */
	private String divideByFive(int time, int length, String symbol) {
		String res = "";
		res += Utils.stringRepeat(symbol, time/5);		// Filling the output string with as many Red lights as multiple of five can fit into the time in input
		res += Utils.stringRepeat("O", length - res.length());	// If there is some space left we complete the string with "O"s
		res += "\n";
		
		return res;
	}
	
	/**
	 * Function used to convert normal time in BerlinClock-time for the third and fifth rows.
	 * @param time the number to convert in BerlinClock-time
	 * @param length the length of the row of light in the BerlinClock
	 * @param symbol is the symbol we will use to signal that a light is on
	 * @return the string with the BerlinClock row of lights
	 */
	private String divideByOne(int time, int length, String symbol, String endOfLine) {
		String res = "";
		res += Utils.stringRepeat(symbol, time);		// Filling the output string with as many Red lights as multiple of five can fit into the time in input
		res += Utils.stringRepeat("O", length - res.length());	// If there is some space left we complete the string with "O"s
		
		return res + endOfLine;
	}
	
	/**
	 * Transforms integer minutes into BerlingClock-style minutes for the fourth row of lights in the BerlinClock.
	 * @param time the number to convert in BerlinClock-time
	 * @param length the length of the row of light in the BerlinClock
	 * @return the string with the BerlinClock row of lights
	 */
	private String convertMinutesByFive(int time, int length){
		StringBuilder minutesRow = new StringBuilder();
		
		minutesRow.append( divideByFive(time, length, "Y") );	// Reusing our previous function, dividByFive.
		// We created all the lights in yellow, but some may need to be in red. More precisely those at index 2,5,8.
		for(int i=0; i<11; i++) {
			if( ( i == 2 || 
				  i == 5 ||
				  i == 8 ) &&
				  minutesRow.charAt(i) == 'Y') {
				minutesRow.setCharAt(i, 'R');
			}
		}
		
		return minutesRow.toString();
	}
	
	
}
