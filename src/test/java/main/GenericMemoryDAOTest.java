package main;

import junit.framework.Assert;

import org.junit.Test;

public class GenericMemoryDAOTest {

	@Test
	public void testAddNull() {
		GenericMemoryDAO<Position> positions = new GenericMemoryDAO<Position>();
		positions.add(new Position("12"));
		positions.add(null);
		Assert.assertEquals("[12]", positions.list().toString());
	}
	
	@Test
	public void testRemoveNullAndNotInsertedPosition() {
		GenericMemoryDAO<Position> positions = new GenericMemoryDAO<Position>();
		positions.add(new Position("12"));
		positions.remove(null);
		Assert.assertEquals("[12]", positions.list().toString());
		positions.remove(new Position("13"));
		Assert.assertEquals("[12]", positions.list().toString());
	}
	
	
	@Test
	public void testWithDevelopers() {
		GenericMemoryDAO<Developer> developers = new GenericMemoryDAO<Developer>();
		developers.add(new Developer("Developer 1"));
		Assert.assertEquals("[Developer 1]", developers.list().toString());
		developers.add(new Developer("Developer 1"));
		developers.add(new Developer("Developer 2"));
		Assert.assertEquals("[Developer 1, Developer 2]", developers.list().toString());
		developers.remove(new Developer("Developer 1"));
		Assert.assertEquals("[Developer 2]", developers.list().toString());
	}
	
	@Test
	public void testWithPositions() {
		GenericMemoryDAO<Position> positions = new GenericMemoryDAO<Position>();
		positions.add(new Position("19"));
		positions.add(new Position("15"));
		Assert.assertEquals("[19, 15]", positions.list().toString());
		positions.remove(new Position("19"));
		positions.add(new Position("15"));
		Assert.assertEquals("[15]", positions.list().toString());
	}

}
