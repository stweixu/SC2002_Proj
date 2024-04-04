package sc2002GroupProj;

public class OrderUtility {
	
	
//STAFF METHODS
public static void viewDetails(Order order) {
	System.out.println("OrderID: " + order.getOrderID());
	System.out.println("Order status: " + order.getStatus());
	System.out.println("Cart items: " + order.getcartItems());
}


public static void processOrderNewToReady(Order order) {
	if (order.getStatus().equals("New")) {
		order.setStatus("ReadyToPickUp");
	}
}

}
