package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class PositionSortTest {

	@Test
	public void sortWithOneAvailablePosition() {
		DeveloperHome.add(new Developer("Nathan Ferracini"));
		DeveloperHome.add(new Developer("Michel Menegazzo"));
		PositionHome.add(new Position("1"));
		PositionSort.sortDevelopers();
		
		assertEquals(PositionHome.searchPositionName("1"), DeveloperHome.searchDeveloperBy("Nathan Ferracini").getPosition());
		assertEquals(PositionHome.searchPositionName("1"), DeveloperHome.searchDeveloperBy("Michel Menegazzo").getPosition());
		
	}

}
