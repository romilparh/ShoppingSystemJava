package romilparh;

public class User {
	int userID;
	String name;
	int phoneNumber;
	
	private String password;
	private String address;
	private String eMail;
	
	User(){
		this.userID = 0;
		this.name = "";
		this.phoneNumber = 0;
		this.password = "";
		this.address = "";
		this.eMail = "";
		
	}
	
	// Implement eMail validation through function
	User(int userID, String name, int phoneNumber, String password, String address, String eMail){
		this.userID = userID;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.address = address;
		this.eMail = eMail;
	}
	
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
