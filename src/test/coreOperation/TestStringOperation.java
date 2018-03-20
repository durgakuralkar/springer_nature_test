package test.coreOperation;

import main.coreOperation.StringOperation;
import test.applicationConstant.TestApplicationMessages;
import static org.junit.Assert.*;

import org.junit.Test;	


// TODO: Auto-generated Javadoc
/**
 * The Class TestStringOperation.
 */
public class TestStringOperation {
	
	/**
	 * Test convert to upper case.
	 */
	@Test
	public void testConvertToUpperCase() {
		
		StringOperation testStringOperation= new StringOperation();
		assertEquals(testStringOperation.convertToUpperCase(
				TestApplicationMessages.LOWER_CASE_LINE),TestApplicationMessages.UPPER_CASE_LINE);
	}

}
