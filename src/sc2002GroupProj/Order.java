package sc2002GroupProj;

public class Order {
	
	private int orderID;
	private String status;
	private String cartItems; //String is placeholder class for cart
	
	public Order(int orderID, String status, String cartItems) {
		this.orderID = orderID;
		this.status = status;
		this.cartItems = cartItems;
	}

	
	
//getters and setters
	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getcartItems() {
		return cartItems;
	}

	public void setcartItems(String cartItems) {
		this.cartItems = cartItems;
	}
	
	

}
