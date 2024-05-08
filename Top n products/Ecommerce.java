package Affordmed;

public class Ecommerce {
	
	private String productsName;
	private String price;
	private String rating;
	private String discount;
	private String availability;
	public Ecommerce() {
		
	}
	
	public Ecommerce(String productsName, String price, String rating, String discount, String availability) {
		super();
		this.productsName = productsName;
		this.price = price;
		this.rating = rating;
		this.discount = discount;
		this.availability = availability;
	}

	public String getProductsName() {
		return productsName;
	}
	public void setProductsName(String productsName) {
		this.productsName = productsName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}

}
