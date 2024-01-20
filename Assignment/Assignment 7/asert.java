package assignment;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class asert {
	
	@Test
	public void test1() {
		
	int a =10;
	int b =20;
	assertEquals(b, a);
	assertTrue(false);
	}
	
	public void test2() {
		int x[]= {1,2,3,4,5,6};
		int y[]= {1,2,3,4,5,6};
		assertArrayEquals(x, y);
	}

	
}
