package com.coderwizard.maven.mavendemo1;

import org.junit.Assert;
import org.junit.Test;

//import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
    public void givenNameWhenHelloReturnHelloName() {
    	
    	App app = new App();
    	String result = app.hello("Rai");
    	Assert.assertNotNull(result);
    }
}
