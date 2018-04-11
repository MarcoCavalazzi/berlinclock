package com.catalyst.interviews.berlinclock;

// General class for a clock.
public class Clock {
	private boolean debug = false;	// Variable used to activate or deactivate debugging I/O statements.
	
	/**
	 * Retrieves the hours from the input string
	 * @param time String containing the time of the day
	 * @return the Integer value of the hours
	 */
	protected int getHours(String time) {
		String hours = time.substring(0, 2); // Returns the first 2 characters of the input string
		if(debug) {
			System.out.println("hours\t: "+hours);
		}
		return Integer.parseInt( hours );	
	}
	
	/**
	 * Retrieves the minutes from the input string
	 * @param time String containing the time of the day
	 * @return the Integer value of the minutes
	 */
	protected int getMinutes(String time) {
		String minutes = time.substring(3, 5);
		if(debug) {
			System.out.println("minutes\t: "+minutes);
		}
		return Integer.parseInt( minutes );
	}
	
	/**
	 * Retrieves the seconds from the input string
	 * @param time String containing the time of the day
	 * @return the Integer value of the seconds
	 */
	protected int getSeconds(String time) {
		String seconds = time.substring(6, 8);
		if(debug) {
			System.out.println("seconds\t: "+seconds);
		}
		return Integer.parseInt( seconds );
	}

}
