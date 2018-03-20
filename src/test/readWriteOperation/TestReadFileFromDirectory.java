package test.readWriteOperation;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;

import main.readWriteOperation.ReadFileFromDirectory;

/**
 * The Class TestReadFileFromDirectory.
 */
public class TestReadFileFromDirectory {
	
	/**
	 * Test list files for folder.
	 */
	@Test
	public void testListFilesForFolder() {
		ReadFileFromDirectory readFileFromDirectory= new ReadFileFromDirectory();
		File folder= new File("c:/test");
		
		assertEquals(readFileFromDirectory.listFilesForFolder(folder).length
				,2);
	}
	
	/**
	 * Test list files for folder when empty.
	 */
	@Test
	public void testListFilesForFolderWhenEmpty() {
		ReadFileFromDirectory readFileFromDirectory= new ReadFileFromDirectory();
		File folder= new File("c:/test1");
		
		assertEquals(readFileFromDirectory.listFilesForFolder(folder)
				,null);
	}

}
