package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PositionTest {

	@Test
	public void testAddLocation() {
		Position location = new Position("18");
		PositionHome.add(location);
		assertEquals("18", Position.searchBy("18").getName());
	}
	
	@Test
	public void testEquals() {
		assertEquals(new Position("01"), new Position("01"));
	}
	
}
