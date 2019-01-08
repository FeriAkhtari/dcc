package dcc;

import org.junit.Test;

public class FruitTest {
	private Fruit fruit;
	
	@Test(expected = Exception.class)
	public void nameShouldNotBeNull_WhenCreated() throws Exception {
		fruit = new Apple(null, 0.10);	
	}
	
	@Test(expected = Exception.class)
	public void nameShouldNotBeEmpty_WhenCreated() throws Exception {
		fruit = new Apple("", 0.10);	
	}
	
	@Test(expected = Exception.class)
	public void priceShouldNotBeNull_WhenCreated() throws Exception {
		fruit = new Apple("Cox", null);	
	}
	
	@Test(expected = Exception.class)
	public void priceShouldBeGreaterThanZero_WhenCreated() throws Exception {
		fruit = new Apple("Cox", 0.0);	
	}

}
