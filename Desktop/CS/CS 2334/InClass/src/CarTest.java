import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test
	public void testToString() {
		
		
		String expected = "50";
		Car testobj = new Car(50);
		
		String actual = testobj.toString();
		
		assertEquals(expected,actual );
		
	}

}
