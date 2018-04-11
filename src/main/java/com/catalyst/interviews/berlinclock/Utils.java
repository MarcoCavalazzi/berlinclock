package com.catalyst.interviews.berlinclock;

public class Utils {
	/**
	 * Method that returns the string in input repeated N times.
	 * @param str string in input
	 * @param times number of times the string needs to be repeated
	 * @return the new string containing the one in input N times
	 */
	public static String stringRepeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }
}
