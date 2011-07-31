/**
 * 
 */
package main;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author michelmenega
 *
 */
public class DeveloperTest {

	@Test
	public void test() {
		Developer developer = new Developer("Michel");
		developer.setPosition(new Position("18"));
		Assert.assertEquals("Michel", developer.getName());
		Assert.assertEquals("18", developer.getPosition().getName());
	}
	
	@Test
	public void lastTimeMoved() {
		Developer developer = new Developer("Nathan");
		developer.setPosition(new Position("1"));
		
		DateTime dateTimeTest = new DateTime();
		DateTime developerDateTime = developer.getLastTimeMoved();
		
		assertEquals(0,dateTimeTest.toLocalDate().compareTo(developerDateTime.toLocalDate()));
	}
	
	@Test
	public void testSearchDeveloperByPosition(){
		DeveloperHome.add(new Developer("Nathan Ferracini"));
		DeveloperHome.add(new Developer("Michel Menegazzo"));
		PositionHome.add(new Position("1"));
		PositionSort.setUp();
		
		Pair pair = DeveloperHome.searchDeveloperBy(PositionHome.searchPosition("1"));
		
		assertEquals(DeveloperHome.searchDeveloperBy("Michel Menegazzo"), pair.getDeveloperA());
		assertEquals(DeveloperHome.searchDeveloperBy("Nathan Ferracini"), pair.getDeveloperB());
	}
	
}
