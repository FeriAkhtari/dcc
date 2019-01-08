package dcc;

public abstract class Fruit {
	private String name;
	private Double price;
	private boolean specialOffer;
	
	public Fruit(String name, Double price) throws Exception {
		
		if (name == null || name.equals("")) {
			throw new Exception("Name is required");
		} else {
			this.name = name;
		}
		
		if (price == null || price <= 0.0) {
			throw new Exception("Price must be greater than 0");
		} else {
			this.price = price;
		}
	
	}
	public String getName() {
		return name;
	}
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setSpacialOffer(boolean spaecilOffer) {
		this.specialOffer = specialOffer;
	}
	public boolean getSpecialOffer() {
		return specialOffer;
	}
	public boolean isOnSpecialOffer() {
		return specialOffer;
	}

}