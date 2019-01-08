package dcc;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private List<Fruit> fruits;
	
	public ShoppingCart() {
		
	}
	
	public void addItem(Fruit fruit) {
		if (fruits == null) {
			fruits = new ArrayList<Fruit>();
		}
		fruits.add(fruit);
	}
	
	public List<Fruit> getList() {
		return this.fruits;
	}

}
