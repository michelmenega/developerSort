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
		developer.setPosition(new Position("18"));
		Assert.assertEquals("Michel", developer.getName());
		Assert.assertEquals("18", developer.getPosition().getName());
	}

}
