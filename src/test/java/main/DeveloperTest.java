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
		developerCalendar.setTime(developer.lastTimeMoved());
		
		assertEquals(calendarTest.get(Calendar.DAY_OF_MONTH), developerCalendar.get(Calendar.DAY_OF_MONTH));
	}
	
}
