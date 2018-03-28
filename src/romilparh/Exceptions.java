package romilparh;

// A file for defining own exceptions with own messages
class UserPasswordException extends Exception{
	public String toString() {
		return "Password of Short Length";
	}
}

class UserNameException extends Exception{
	public String toString() {
		return "Name cannot be null";
	}
}

class AddressException extends Exception{
	public String toString() {
		return "Address Cannot be null";
	}
}

class UserEMailException extends Exception{
	public String toString() {
		return "UserEMail not valid";
	}
}

class UserPhoneNumberException extends Exception{
	public String toString() {
		return "Phone number must be of 10 digits";
	}
}

class UserIDException extends Exception{
	public String toString() {
		return "User ID cannot be null";
	}
}

class AdministratorVerificationGridException extends Exception{
	public String toString() {
		return "Verification Grid too long";
	}
}

class CardNumberException extends Exception{
	public String toString() {
		return "Card Number must have 16 digits";
	}
}

class CardCVVException extends Exception{
	public String toString() {
		return "Card CVV should have 3 digits only";
	}
}

class CardTypeException extends Exception{
	public String toString() {
		return "Card Type can only be Credit and Debit only";
	}
}

class ProductIDException extends Exception{
	public String toString() {
		return "Product ID cannot be null";
	}
}

class ProductNameException extends Exception{
	public String toString() {
		return "Product Name cannot be null";
	}
}

class ProductPriceException extends Exception{
	public String toString() {
		return "Product Price Cannot be 0";
	}
}

class ShoppingCartIDException extends Exception{
	public String toString() {
		return "Shopping Cart ID cannot be null";
	}
}

class OrderIDException extends Exception{
	public String toString() {
		return "Shopping Cart ID cannot be null";
	}
}

class ShipmentIDException extends Exception{
	public String toString() {
		return "Shipment ID cannot be null";
	}
}

class ShippingTypeException extends Exception{
	public String toString() {
		return "Shipping Type can only be in Personal or Commercial";
	}
}

class ShippingCostException extends Exception{
	public String toString() {
		return "Shopping Cost Cannot be 0";
	}
}

class ShippingStatusException extends Exception{
	public String toString() {
		return "Shopping Status can only be in Processing or Transit";
	}
}