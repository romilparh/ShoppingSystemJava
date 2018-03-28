package romilparh;

public class User implements IShowDetails{
	// Variables
	String userID;
	
	// Private variables
	private String password;
	private String address;
	private String eMail;	
	private String name;
	private long phoneNumber;
	
	// Constructors
	User(){
	}
	
	User(String userID, String name, long phoneNumber, String password, String address, String eMail){
			try {
				if(isValidEmailAddress(eMail) && isValidPassword(password) && isValidName(name) && isValidAddress(address) && isValidPhoneNumber(phoneNumber) && isValidUserID(userID)) {
						this.userID = userID;
						this.name = name;
						this.phoneNumber = phoneNumber;
						this.password = password;
						this.address = address;
						this.eMail = eMail;
						System.out.println("User Created Successfully");
					}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	// Data Validation Functions and User Defined Exceptions thrown from here
	public boolean isValidPassword(String password) throws UserPasswordException{
		if(password.length()>7) {
			return true;
		}	else {
			UserPasswordException e = new UserPasswordException();
			throw e;
		}
	}
	
	public boolean isValidName(String name) throws UserNameException{
		if(name == "") {
			UserNameException e = new UserNameException();
			throw e;
		}
		else {
			return true;
		}
	}
	
	public boolean isValidEmailAddress(String email) throws UserEMailException{
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        
        if(!m.matches()) {
        	UserEMailException e = new UserEMailException();
        	throw e;
        } else {
        		return m.matches();
        }
        
	}
	
	public boolean isValidAddress(String address) throws AddressException{
		if(address == "") {
			AddressException e = new AddressException();
			throw e;
		} else {
			return true;
		}
	}
	
	public boolean isValidPhoneNumber(long phoneNumber) throws UserPhoneNumberException{
		if(phoneNumber<1000000000L || phoneNumber>9999999999L) {
			UserPhoneNumberException e = new UserPhoneNumberException();
			throw e;
		} else {
			return true;
		}
	}
	
	public boolean isValidUserID(String userID) throws UserIDException{
		if(userID == "") {
			UserIDException e = new UserIDException();
			throw e;
		} else {
			return true;
		}
	}
	
	// Data Updation Functions
	public void changePassword(String password){
		try {
			if(isValidPassword(password)) {
				this.password = password;
			}
		} catch (UserPasswordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void changeAddress(String address){
		try {
			if(isValidAddress(address)) {
				this.address = address;
			}
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		System.out.println("User ID: "+this.userID);
		System.out.println("User Name: "+this.name);
	}
}
