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
	private long cardNumber;
	private Date cardExpiry;
	private int cardCVV;
	private char cardType;
	
	// Constructor Definition
	Customer(){
	}
	
	Customer(long cardNumber, Date cardExpiry, int cardCVV, char cardType, String userID){
		try {
			if(isValidUserID(userID) && isValidCardNumber(cardNumber) && isValidCardCVV(cardCVV) && isValidCardType(cardType)) {
			this.cardNumber = cardNumber;
			this.cardExpiry = cardExpiry;
			this.cardCVV = cardCVV;
			this.cardType = cardType;
			this.userID = userID;
			System.out.println("Customer Object Created Successfully");
			}
		} catch (UserIDException | CardNumberException | CardCVVException | CardTypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	// Validation Functions
	
	public boolean isValidCardNumber(long cardNumber) throws CardNumberException{
		if(cardNumber>9999999999999999L || cardNumber<1000000000000000L) {
			CardNumberException e = new CardNumberException();
			throw e;
		}
		else {
			return true;
		}
	}
	
	public boolean isValidCardCVV(int CVV) throws CardCVVException{
		if(CVV>999 || CVV <100) {
			CardCVVException e = new CardCVVException();
			throw e;
		}
		else {
			return true;
		}
	}
	
	public boolean isValidCardType(char cardType) throws CardTypeException{
		if(cardType == 'C' || cardType == 'D') {
			return true;
		}
		else {
			CardTypeException e = new CardTypeException();
			throw e;
		}
	}
	
	// Value Updation Methods
	public void updateCardNumber(long cardNumber) {
		try {
			if(isValidCardNumber(cardNumber)) {
				this.cardNumber = cardNumber;
			}
		} catch (CardNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void updateCardExpiry(Date cardExpiry) {
		this.cardExpiry = cardExpiry;
	}
	
	public void updateCardType(char cardType) {
		try {
			if(isValidCardType(cardType)) {
				this.cardType = cardType;
			}
		} catch (CardTypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateCardCVV(int cardCVV) {
		try {
			if(isValidCardCVV(cardCVV)) {
				this.cardCVV = cardCVV;
			}
		} catch (CardCVVException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
