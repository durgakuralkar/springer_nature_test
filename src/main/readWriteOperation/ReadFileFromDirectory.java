package main.readWriteOperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import main.applicationConstant.ApplicationMessages;
import main.coreOperation.StringOperation;

// TODO: Auto-generated Javadoc
/**
 * The Class ReadFileFromDirectory.
 */
public class ReadFileFromDirectory {
	
	/**
	 * List files for folder.
	 *
	 * @param folder the folder
	 * @return the file[]
	 */
	public File[] listFilesForFolder(File folder) {
		
		File[] listOfFiles = folder.listFiles();

		return listOfFiles;
	}
	
	/**
	 * Prints the file content.
	 *
	 * @param file the file
	 * @param fileName the file name
	 */
	public void printFileContent(File file,String fileName) {
		try {
			
			BufferedReader r = new BufferedReader( new FileReader(file) );
			String upperCaseLine = " ", line = null;
			while ((line = r.readLine()) != null) {
				upperCaseLine += StringOperation.convertToUpperCase(line.toString());
			}
			if(upperCaseLine.equals("")) {
				System.out.println(fileName + ApplicationMessages.IS_EMPTY);
			}
			else {
				System.out.println(fileName + ApplicationMessages.COLON + upperCaseLine);
			}
			}
			
			catch(Exception ex) {
				
				}
			}
	
}	


