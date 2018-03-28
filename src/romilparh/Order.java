/**
 * 
 */
package romilparh;

import java.util.Date;

/**
 * @author shadybond
 *
 */
public class Order extends Customer implements IShowDetails {

	// Variable and Object Definition
	String orderID;
	String address;
	Date dateOrdered;
	ShoppingCart shoppingCart;
	
	// Constructors
	Order(){
	}
	
	Order(String orderID, String address, Date dateOrdered, ShoppingCart shoppingCart){
		try {
			if(isValidAddress(address) && isValidOrderID(orderID)) {
				this.orderID = orderID;
				this.address = address;
				this.dateOrdered = dateOrdered;
				this.shoppingCart = shoppingCart;
				this.userID = shoppingCart.userID;	
			}
		} catch (AddressException | OrderIDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// Validation Functions 
	
	public boolean isValidAddress(String address) throws AddressException{
		if(address == "") {
			AddressException e = new AddressException();
			throw e;
		} else {
			return true;
		}
	}
	
	public boolean isValidOrderID(String orderID) throws OrderIDException{
		if(address == "") {
			OrderIDException e = new OrderIDException();
			throw e;
		} else {
			return true;
		}
	}
	
	
	// showDetails Method from IShowDetails Interface
	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		for(int i=0;i<50;i++) {
			System.out.print("*");
		}
		System.out.println("\n");
		System.out.println("Order ID:" + this.orderID);
		System.out.println("Address:" + this.address);
		System.out.println("Date Ordered:" + this.dateOrdered);
		
		System.out.println("Product List \t Product Quantity \t");
		for(int i=0;i<this.shoppingCart.productList.size();i++) {
			System.out.print(this.shoppingCart.productList.get(i).productName+"\t");
			System.out.print(this.shoppingCart.productQuantity.get(i)+"\t \n");
		}
		System.out.println("Order Total: $"+this.shoppingCart.total);
		// Print *
		for(int i=0;i<50;i++) {
			System.out.print("*");
		}
	}
}
