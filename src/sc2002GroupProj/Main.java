package sc2002GroupProj;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static CustomerUtility CustomerUtility;
	private static OrderListUtility OrderListUtility;
	private static OrderUtility OrderUtility;

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("------Customer Interface------");
		System.out.println("Select branch\n");
		
		System.out.println("What would you like to do?");
		System.out.println("1: Create new order");
		System.out.println("2: Check placed order status with Order ID");
		//choice = sc.nextInt();
		
		//Test run: create an order & Order list
		System.out.println("You have selected 2.\n");
		
		Order testOrder1 = new Order(1, "New", "cart1"); //OrderID, Status, cartItems
		Order testOrder2 = new Order(2, "New", "cart2");
		Order testOrder3 = new Order(3, "Completed", "cart3");
		
		//This part is bloated because OrderList should not be instantiated in main. it should
		//It should already be instantiated/saved via our files, this is just for test purposes
		ArrayList<Order> testOrderList = new ArrayList<>(); 
		OrderList orderList = new OrderList(testOrderList);
		
		orderList.append(testOrder1);
		orderList.append(testOrder2);
		orderList.append(testOrder3);
		
		int choice = 2;

		System.out.println("Test run: if customer inputs orderID from 1 to 4\n");
		
		for (int orderID = 1; orderID <= 4; orderID++) {
			System.out.println("What is your order ID?");
			System.out.println("Your input is " + Integer.toString(orderID));
			CustomerUtility.viewOrderStatusUsingOrderID(orderList, orderID);
			System.out.println("");
		}
		
		
	}

}
