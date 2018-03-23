/**
 * 
 */
package romilparh;

import java.util.Date;

/**
 * @author shadybond
 *
 */
public class Order implements ShowDetails {
	String orderID;
	String address;
	Date dateOrdered;
	/* (non-Javadoc)
	 * @see romilparh.ShowDetails#showDetails()
	 */
	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		for(int i=0;i<50;i++) {
			System.out.print("*");
		}
		System.out.println("Product ID:" + this.orderID);
		System.out.println("Product Name:" + this.address);
		System.out.println("Product Price:" + this.dateOrdered);
		// Print *
		for(int i=0;i<50;i++) {
			System.out.print("*");
		}
	}

}
