package pbox;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoxTest {

	@Test
	void testBoxDoubleDoubleDouble() {
		Box box = new Box(1,2,3);
		System.out.println(box);
	}

	@Test
	void testBoxDoubleDouble() {
		Box box2 = new Box(1,2);
		System.out.println(box2);
	}

	@Test
	void testBoxDouble() {
		Box box3 = new Box(1);
		System.out.println(box3);
	}

	@Test
	void testGetHeight() {
		fail("Not yet implemented");
	}

	@Test
	void testSetHeight() {
		fail("Not yet implemented");
	}

	@Test
	void testGetWidth() {
		fail("Not yet implemented");
	}

	@Test
	void testSetWidth() {
		fail("Not yet implemented");
	}

	@Test
	void testGetLength() {
		fail("Not yet implemented");
	}

	@Test
	void testSetLength() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
