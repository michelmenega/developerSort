/**
 * 
 */
package main;

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
		Assert.assertEquals("Michel", developer.getName());
		developer.setLocation(new Location("18"));
		Assert.assertEquals("18", developer.getLocation().getName());
	}

}
