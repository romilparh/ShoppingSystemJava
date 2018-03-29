/**
 * 
 */
package romilparh;

import java.util.Date;

/**
 * @author shadybond
 *
 */

// What is left: User Defined Exceptions, eMail validation, all other input validation like password
public class MediatorClass {
	/**
	 * @param args
	 */
	// All the objects for all the classes defined here foe better management
	public static void main(String[] args) {
		Date dateOne = new Date(2021, 2, 21);
		Date dateTwo = new Date(2022,5,1);
		
		// Product Objects Definition
		Product productOne = new Product("1", "Trimmer", 100, 'E');
		Product productTwo = new Product("2","Heater", 200, 'E');
		Product productThree = new Product("3", "Olay Extra Moisturising Shampoo", (float) 9.34, 'C');
		Product productFour = new Product("4", "Olay Conditioner", (float) 5.44,'C');
		
		// User Objects Definition
		User userOne = new User("1", "Pikachu", 9878556743L, "Panda123", "Brampton", "romilparhwal007@gmail.com");
		User userTwo = new User("2", "Panda", 9878987833L, "HelloHello987", "Vancouver", "gurpreet@gmail.com");
		User userThree = new User("3", "Gagandeep", 7657889932L,"Gagandeep","Toronto","gagandeepbrar0808@gmail.com");
		
		// Customer Objects Definition
		Customer customerOne = new Customer(7000555534568653L, dateOne, 221, 'D', "2");
		Customer customerTwo = new Customer(2345434231232342L, dateTwo, 123, 'C', "3");
		
		// Administrator Objects Definition
		Administrator administratorOne = new Administrator(1995, "1");
		
		// Shopping Cart Object Definition
		ShoppingCart shoppingCartOne = new ShoppingCart("2", "1");
		shoppingCartOne.addItem(productOne, 2);
		shoppingCartOne.addItem(productFour, 3);
		
		shoppingCartOne.showDetails();
		
		// Order Object Definition
		Order orderOne = new Order("1", "Brampton", dateTwo, shoppingCartOne);
		orderOne.showDetails();
		
		ShipmentInfo shipmentInfoOne = new ShipmentInfo("1", 'P', (float)12.33, 'P', orderOne);
		shipmentInfoOne.showDetails();
	}
	

}
