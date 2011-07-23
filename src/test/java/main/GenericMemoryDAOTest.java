package main;

import junit.framework.Assert;

import org.junit.Test;

public class GenericMemoryDAOTest {

	@Test
	public void testWithDevelopers() {
		GenericMemoryDAO<Developer> developers = new GenericMemoryDAO<Developer>();
		developers.add(new Developer("Developer 1"));
		Assert.assertEquals("[Developer 1]", developers.list().toString());
	}
	
	@Test
	public void testWithPositions() {
		GenericMemoryDAO<Position> positions = new GenericMemoryDAO<Position>();
		positions.add(new Position("19"));
		Assert.assertEquals("[19]", positions.list().toString());
	}

}
