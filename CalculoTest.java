import junit.framework.TestCase;

import org.junit.Test;

public class CalculoTest {
	
	@Test
	public void addTest() {
		
        TestCase.assertEquals(40.0, Calculos.add(25.0, 15.0));
    
	}
	
	@Test
	public void subTest() {
		
		TestCase.assertEquals(5.0, Calculos.sub(10, 5));
	     
	}
	
	@Test
	public void divTest() {
		
		TestCase.assertEquals(3.0, Calculos.div(33, 11));
	    
		
	}
	
	@Test
	public void mulTest() {
		
		TestCase.assertEquals(12.0, Calculos.mul(4, 3));
	     
	}
		   
}
