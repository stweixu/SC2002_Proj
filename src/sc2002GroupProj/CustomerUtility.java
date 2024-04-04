package sc2002GroupProj;

public class CustomerUtility {
	

public static void viewOrderStatusUsingOrderID(OrderList orderList, int orderID) {
	
	Order tempOrder = OrderListUtility.findOrderWithOrderID(orderList, orderID);
	
	if (tempOrder != null) {
		System.out.println("Order ID " + orderID + "'s current status is " + tempOrder.getStatus() + ".");
	} else {
		System.out.println("Order could not be found.");
	}
}

}
