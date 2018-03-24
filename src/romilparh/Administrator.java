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
	Administrator(int verificationGrid, int userID){
		this.verificationGrid = verificationGrid;
		this.userID = userID;
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
			System.out.print("*");
		}
		System.out.println("Administrator's User ID:" + this.userID);
		// Print *
		for(int i=0;i<50;i++) {
			System.out.print("*");
		}
	}
	
	// Administrator Class confined method
	public void updateVerificationGrid(int verificationGrid) {
		this.verificationGrid = verificationGrid;
	}

}
