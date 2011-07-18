package main;

import junit.framework.Assert;

import org.junit.Test;

public class LocationTest {

	@Test
	public void testAddLocation() {
		Location location = new Location("18");
		LocationHome.add(location);
		Assert.assertEquals("18", Location.searchBy("18").getName());
	}

}
