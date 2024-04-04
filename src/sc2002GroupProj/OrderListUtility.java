package sc2002GroupProj;

import java.util.ArrayList;
//import sc2002GroupProj.OrderUtility;

public class OrderListUtility {

	//All static methods (no objects instantiation required)
	//Instead, pass in a specific Order object as argument into OrderListUtility methods
	
	
//METHODS
public static void addOrderToList(OrderList orderList, order order) {
	orderList.add(order);
}
	
	//Customer methods
public static Order findOrderWithOrderID(OrderList orderList, int orderID) {
	
	ArrayList<Order> tempOrderList = orderList.getOrderList();
	
	for (Order order: tempOrderList) {
		if (order.getOrderID() == orderID)
			return order;
	}
	//ELSE
	return null;
}
	


public static void viewOrderStatusUsingOrderID(OrderList orderList, int orderID) {
		
		Order tempOrder = findOrderWithOrderID(orderList, orderID);
		
		if (tempOrder != null)
			System.out.println("Order " + orderID + " current status is " + tempOrder.getStatus());
}
	
	
	//Staff methods
public static void displayNewOrders(OrderList orderList) {
	
	ArrayList<Order> tempOrderList = orderList.getOrderList();
	
	for (Order order: tempOrderList) {
		if ( order.getStatus().equals("New") ) {
			OrderUtility.viewDetails(order);		
		}
	}
}
}
