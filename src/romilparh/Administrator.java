/**
 * 
 */
package romilparh;

/**
 * @author shadybond
 *
 */

public class Administrator extends User implements IShowDetails {
	// Variable definition
	private int verificationGrid;
	
	// Constructor definition
	Administrator(int verificationGrid, String userID){
		try {
			if(isValidUserID(userID) && isValidGrid(verificationGrid)) {
				this.verificationGrid = verificationGrid;
				this.userID = userID;
				System.out.println("Administrator Object Created Successfully");
			}
		} catch (UserIDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AdministratorVerificationGridException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	Administrator(){
	}
	
	/* (non-Javadoc)
	 * @see romilparh.ShowDetails#showDetails()
	 * Interface Method
	 */
	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		for(int i=0;i<50;i++) {
			System.out.println("*");
		}
		System.out.println("Administrator's User ID:" + this.userID);
		// Print *
		for(int i=0;i<50;i++) {
			System.out.println("*");
		}
	}
	
	// Validations
	
	public boolean isValidGrid(int verificationGrid) throws AdministratorVerificationGridException{
		if(verificationGrid<1000 || verificationGrid>9999) {
			AdministratorVerificationGridException e = new AdministratorVerificationGridException();
			throw e;
		} else {
			return true;
		}
	}
	
	// Administrator Class confined method
	public void updateVerificationGrid(int verificationGrid) {
		this.verificationGrid = verificationGrid;
	}

}
