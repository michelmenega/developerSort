/**
 * 
 */
package main;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

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
		
		Calendar calendarTest = Calendar.getInstance();
		calendarTest.setTime(new Date());
		
		Calendar developerCalendar = Calendar.getInstance();
		developerCalendar.setTime(developer.getLastTimeMoved());
		
		assertEquals(calendarTest.get(Calendar.DAY_OF_MONTH), developerCalendar.get(Calendar.DAY_OF_MONTH));
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
