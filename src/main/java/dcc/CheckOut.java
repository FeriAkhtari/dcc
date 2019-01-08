package dcc;

import java.util.List;

public class CheckOut {

	private static String[] items = { "Apple", "Apple", "Orange", "Apple" };

	public static void main(String[] args) throws Exception {
		Apple apple = new Apple("Cox", 0.60);
		Orange orange = new Orange("Jaffa", 0.25);
		Double totalCost = 0.0;
//		Double orangeCount = 0.0;
//		Double appleCount = 0.0;
//		Double whole = 0.0;
//		Double rem = 0.0;
		apple.setSpacialOffer(true);
		orange.setSpacialOffer(true);

		if (items.length > 0) {

			ShoppingCart shoppingCart = new ShoppingCart();
			for (int i = 0; i < items.length; i++) {
				/*
				 * if (args[i].equalsIgnoreCase("Apple")) { totalCost += apple.getPrice(); }
				 * else if (args[i].equalsIgnoreCase("Orange")) { totalCost +=
				 * orange.getPrice(); }
				 */
				if (items[i].equalsIgnoreCase("Apple")) {
					shoppingCart.addItem(apple);
				} else if (items[i].equalsIgnoreCase("Orange")) {
					shoppingCart.addItem(orange);
				}
			}

//			if (args[i].equalsIgnoreCase("Apple")) { appleCount += 1;}
//			else if(args[i].equalsIgnoreCase("Orange")) {orangeCount += 1;}
//		
//			}
//		

//			if (appleCount > 0) {
//		
//			if (apple.isOnSpecialOffer()) {
//				whole = appleCount / 2;
//				rem = appleCount % 2;
//				totalCost += whole * apple.getPrice() + rem * apple.getPrice();
//			} else {
//				totalCost += (appleCount * apple.getPrice());
//			}
//		
//			}
//		
//		
//			if (orangeCount > 0) {
//			if(orange.isOnSpecialOffer()) {
//				whole = orangeCount / 3;
//				rem = orangeCount % 3;
//				totalCost += whole * orange.getPrice() * 2 + rem * orange.getPrice();
//			} else {
//				totalCost = totalCost + (orangeCount * orange.getPrice());
//			}
//			
//		
//			}

			System.out.println("Total Price: " + totalCost);
		}
	}

}
