/**
 * 
 */
package romilparh;

/**
 * @author shadybond
 *
 */
public class Product implements IShowDetails {
	String productID;
	String productName;
	float productPrice;
	private char productType;
	/* (non-Javadoc)
	 * @see romilparh.ShowDetails#showDetails()
	 */
	
	Product(){
	}
	
	Product(String productID, String productName, float productPrice, char productType){
		try {
			if(isValidProductID(productID) && isValidProductName(productName) && isValidProductPrice(productPrice)) {
				this.productID = productID;
				this.productName = productName;
				this.productPrice = productPrice;
				this.productType = productType;
			}
		} catch (ProductIDException | ProductNameException | ProductPriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	// Validation Functions
	
	public boolean isValidProductID(String productID) throws ProductIDException{
		if(productID == "") {
			ProductIDException e = new ProductIDException();
			throw e;
		} else {
			return true;
		}
	}
	
	public boolean isValidProductName(String productName) throws ProductNameException{
		if(productName == "") {
			ProductNameException e = new ProductNameException();
			throw e;
		} else {
			return true;
		}
	}
	
	public boolean isValidProductPrice(float price) throws ProductPriceException{
		if(price<=0) {
			ProductPriceException e = new ProductPriceException();
			throw e;
		} else {
			return true;
		}
	}
	
	// Value Updation Function
	public void updateProductID(String productID){
		try {
			if(isValidProductID(productID))
				this.productID = productID;
		} catch (ProductIDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateProductName(String productName) {
		try {
			if(isValidProductName(productName)) {
				this.productName = productName;
			}
		} catch (ProductNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void updatePrice(float price) {
		try {
			if(isValidProductPrice(price)) {
				this.productPrice = price;
			}
		} catch (ProductPriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateType(char productType) {
		this.productType = productType;
	}
}
