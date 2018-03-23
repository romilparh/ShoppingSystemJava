/**
 * 
 */
package romilparh;

/**
 * @author shadybond
 *
 */
public class Product implements ShowDetails {
	String productID;
	String productName;
	float productPrice;
	private char productType;
	/* (non-Javadoc)
	 * @see romilparh.ShowDetails#showDetails()
	 */
	
	Product(){
		this.productID = "";
		this.productName = "";
		this.productPrice = 0;
		this.productType = 'x';
	}
	
	Product(String productID, String productName, float productPrice, char productType){
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productType = productType;
	}
	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		for(int i=0;i<50;i++) {
			System.out.print("*");
		}
		System.out.println("Product ID:" + this.productID);
		System.out.println("Product Name:" + this.productName);
		System.out.println("Product Price:" + this.productPrice);
		System.out.println("Product Type:" + this.productType);
		// Print *
		for(int i=0;i<50;i++) {
			System.out.print("*");
		}
	}

}
