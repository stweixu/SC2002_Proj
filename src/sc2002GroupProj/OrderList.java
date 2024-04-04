package sc2002GroupProj;

import java.util.*;

public class OrderList {
	private ArrayList<Order> orderList;
	
	public OrderList(ArrayList<Order> orderList) {
		this.orderList = orderList;
	}
	
	public void append(Order order) {
		this.orderList.add(order);
	}

	//getter and setter
	public ArrayList<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(ArrayList<Order> orderList) {
		this.orderList = orderList;
	}

}
