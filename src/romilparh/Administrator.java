/**
 * 
 */
package romilparh;

/**
 * @author shadybond
 *
 */
public class Administrator extends User implements ShowDetails {
	private int verificationGrid;
	
	Administrator(int verificationGrid, int userID){
		this.verificationGrid = verificationGrid;
		this.userID = userID;
	}
	
	Administrator(){
		this.verificationGrid = 0;
		this.userID = 0;
	}
	/* (non-Javadoc)
	 * @see romilparh.ShowDetails#showDetails()
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

}
