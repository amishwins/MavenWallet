package amish.MavenWallet.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class BillTest {
	Bill b = new Bill(5);

	@Test
	public void test() {
		assertTrue(Integer.parseInt("1") == 1);
	}
	
	@Test
	public void failingTest() {
		assertEquals(5, b.getValue());
	}

}
