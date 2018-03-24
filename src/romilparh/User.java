package romilparh;

public class User {
	// Variables
	int userID;
	String name;
	int phoneNumber;
	
	// Private variables
	private String password;
	private String address;
	private String eMail;
	
	// Constructors
	User(){
	}
	
	User(int userID, String name, int phoneNumber, String password, String address, String eMail){
		this.userID = userID;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.address = address;
		this.eMail = eMail;
	}
	
	// Class Confined Functions
	public void changePassword(String password) {
		this.password = password;
	}
	
	public void changeAddress(String address) {
		this.address = address;
	}
	
	public Boolean isValideMail(String eMail) {
		return true;
	}
}
