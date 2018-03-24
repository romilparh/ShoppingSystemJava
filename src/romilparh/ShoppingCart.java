package romilparh;
import java.util.ArrayList;

// Check Iterator Example for ArrayList
public class ShoppingCart extends Customer implements IShowDetails {
	// Variables and Objects Definition
	String cartID;
	ArrayList <Product> productList = new ArrayList();
	ArrayList <Integer> productQuantity = new ArrayList();
	ArrayList <Float> subTotal = new ArrayList();
	float total = 0;
	
	// Constructor Definition
	
	ShoppingCart(){
		
	}
	
	ShoppingCart(int userID, String cartID){
		this.userID = userID;
		this.cartID = cartID;
	}
	
	// showDetails Method from IShowDetails Interface
	@Override
	public void showDetails() {
		// Show Card ID, Customer ID, Product Array
		for(int i=0;i<50;i++) {
			System.out.print("*");
		}
		System.out.println("Cart ID:"+this.cartID);
		System.out.println("Product \t Product Quantity \t Product Quantity");
		for(int i = 0; i<this.productList.size();i++) {
			System.out.print(this.productList.get(i)+"\t");
			System.out.print(this.productQuantity.get(i)+"\t");
			System.out.print("$"+this.subTotal.get(i)+"\t");
			System.out.print("\n");
		}
		calculateTotal();
		System.out.println("Total Price: $"+this.total);
		// Print *
		for(int i=0;i<50;i++) {
			System.out.print("*");
		}
	}
	
	// Class Confined Methods
	public void addItem(Product product, int quantity) {
		this.productList.add(product);
		this.productQuantity.add(quantity);
		this.subTotal.add(product.productPrice*quantity);
	}
	
	public void calculateTotal() {
		// Calculate total of products and call this method in show details
		for(int i=0; i<this.productList.size();i++) {
			this.total += this.subTotal.get(i);
		}
	}

}