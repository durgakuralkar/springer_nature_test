package main.coreOperation;

import java.util.StringTokenizer;

import main.applicationConstant.ApplicationMessages;

/**
 * The Class StringOperation.
 */
public class StringOperation {
	
	/**
	 * Convert to upper case.
	 *
	 * @param line the line
	 * @return the string
	 */
	public static String convertToUpperCase(String line) {
		
		String upperCaseLine = "";
		StringTokenizer tokenizer = new StringTokenizer(line,ApplicationMessages.SPACE_TOKENENISER);
		 while(tokenizer.hasMoreTokens())
	        {
			 upperCaseLine += convertFirstletterToCaps(tokenizer.nextToken());
	        }
		
		return upperCaseLine;
	}
	
	
	/**
	 * Convert firstletter to caps.
	 *
	 * @param word the word
	 * @return the string
	 */
	private static String convertFirstletterToCaps(String word) {
		
		word=word.substring(0, 1).toUpperCase() + word.substring(1) + ApplicationMessages.SPACE;
		return word;
	}

}
