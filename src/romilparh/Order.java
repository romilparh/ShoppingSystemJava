/**
 * 
 */
package romilparh;

import java.util.Date;

/**
 * @author shadybond
 *
 */
public class Order implements IShowDetails {

	// Variable and Object Definition
	String orderID;
	String address;
	Date dateOrdered;
	ShoppingCart shoppingCart;
	
	// Constructors
	Order(){
		
	}
	
	Order(String orderID, String address, Date dateOrdered, ShoppingCart shoppingCart){
		this.orderID = orderID;
		this.address = address;
		this.dateOrdered = dateOrdered;
		this.shoppingCart = shoppingCart;
	}
	
	// showDetails Method from IShowDetails Interface
	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		for(int i=0;i<50;i++) {
			System.out.print("*");
		}
		System.out.println("Order ID:" + this.orderID);
		System.out.println("Address:" + this.address);
		System.out.println("Date Ordered:" + this.dateOrdered);
		
		System.out.println("Product List \t Product Quantity \t");
		for(int i=0;i<this.shoppingCart.productList.size();i++) {
			System.out.print(this.shoppingCart.productList.get(i)+"\t");
			System.out.print(this.shoppingCart.productQuantity.get(i)+"\t");
			
		}
		System.out.println("Order Total"+this.shoppingCart.total);
		// Print *
		for(int i=0;i<50;i++) {
			System.out.print("*");
		}
	}
}
