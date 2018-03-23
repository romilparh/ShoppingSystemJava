/**
 * 
 */
package romilparh;

import java.util.Date;

/*
 * @author shadybond 
 *
 */
public class Customer extends User implements ShowDetails{
	private int cardNumber;
	private Date cardExpiry;
	private int cardCVV;
	private char cardType;
	
	Customer(){
		this.cardNumber = 0;
		this.cardExpiry = null;
		this.cardCVV = 0;
		this.cardType = 'x';
		this.userID = 0;
	}
	
	Customer(int cardNumber, Date cardExpiry, int cardCVV, char cardType, int userID){
		this.cardNumber = cardNumber;
		this.cardExpiry = cardExpiry;
		this.cardCVV = cardCVV;
		this.cardType = cardType;
		this.userID = userID;
	}

	@Override
	public void showDetails() {
		// Print *
		for(int i=0;i<50;i++) {
			System.out.print("*");
		}
		System.out.println("Customer's User ID:" + this.userID);
		// Print *
		for(int i=0;i<50;i++) {
			System.out.print("*");
		}
	}
	
	
	
}
