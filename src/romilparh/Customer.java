/**
 * 
 */
package romilparh;

import java.util.Date;

/*
 * @author shadybond 
 *
 */
public class Customer extends User implements IShowDetails{
	// Variable Definition
	private int cardNumber;
	private Date cardExpiry;
	private int cardCVV;
	private char cardType;
	
	// Constructor Definition
	Customer(){
	}
	
	Customer(int cardNumber, Date cardExpiry, int cardCVV, char cardType, int userID){
		this.cardNumber = cardNumber;
		this.cardExpiry = cardExpiry;
		this.cardCVV = cardCVV;
		this.cardType = cardType;
		this.userID = userID;
	}

	// showDetails Method of IShowDetails Interface
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
	
	// Class Confined Methods
	public void updateCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public void updateCardExpiry(Date cardExpiry) {
		this.cardExpiry = cardExpiry;
	}
	
	public void updatecardType(char cardType) {
		this.cardType = cardType;
	}

	public void updateCardCVV(int cardCVV) {
		this.cardCVV = cardCVV;
	}
}
