package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class PositionSortTest {

	@Test
	public void testSetUp() {
		setUp();
		
		assertEquals(PositionHome.searchPosition("1"), DeveloperHome.searchDeveloperBy("Nathan Ferracini").getPosition());
		assertEquals(PositionHome.searchPosition("1"), DeveloperHome.searchDeveloperBy("Michel Menegazzo").getPosition());
	}
	
	@Test
	public void testGetPairs(){
		setUp();
		PositionSort.getAllPairs();
	}
	
	@Test
	public void testEligibleDevelopersToMove(){
		setUp();
	}
	
	private void setUp() {
		DeveloperHome.add(new Developer("Nathan Ferracini"));
		DeveloperHome.add(new Developer("Michel Menegazzo"));
		PositionHome.add(new Position("1"));
		PositionSort.setUp();
		
	}

}
