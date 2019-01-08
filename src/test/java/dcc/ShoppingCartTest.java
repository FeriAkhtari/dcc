package dcc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ShoppingCartTest {
private ShoppingCart shoppingCart = new ShoppingCart();

@Test
public void shouldReturnOneAppleWhenOneAppleAdded() throws Exception {
	Apple apple = new Apple("Cox", 0.20);
	shoppingCart.addItem(apple);
	
	assertEquals(apple, shoppingCart.getList().get(0));
	assertEquals("Pippin", shoppingCart.getList().get(0).getName());
}

}
