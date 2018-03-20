package main.readWriteOperation;



import java.io.File;

import main.applicationConstant.ApplicationMessages;

// TODO: Auto-generated Javadoc
/**
 * The Class MainProgram.
 */
public class MainProgram {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	if(args.length != 0) {
	File folder = new File(args[0]);
	
	ReadFileFromDirectory  readFileFromDirectory= new ReadFileFromDirectory();
	File[] fileList= readFileFromDirectory.listFilesForFolder(folder);
	
	if(fileList.length != 0) {
	for(int i=0; i < fileList.length;i++ ) {
	String fileNameWithExtension= fileList[i].getName();
	String fileName=fileNameWithExtension.substring(0, fileNameWithExtension.lastIndexOf("."));
	readFileFromDirectory.printFileContent(fileList[i],fileName);
	}
	}
	else {
		System.out.println(ApplicationMessages.FILE_NOT_FOUND);
	}}
	else{
		System.out.println(ApplicationMessages.NO_DIRECTORY_FOUND);}
	}
	
}
