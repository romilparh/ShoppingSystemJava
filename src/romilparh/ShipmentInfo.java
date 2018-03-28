package romilparh;

public class ShipmentInfo implements IShowDetails{
	// Variables and Objects Definition
	String shipmentID;
	char shippingType;
	float shippingCost;
	char shippingStatus;
	Order order;
	
	// Constructor Definition
	ShipmentInfo(){
		
	}
	
	ShipmentInfo(String shipmentID, char shippingType, float shippingCost, char shippingStatus, Order order){
		try {
			if(isValidShipmentID(shipmentID) && isValidShippingType(shippingType) && isValidShippingStatus(shippingStatus) && isValidShipmentCost(shippingCost))
			{
				this.shipmentID = shipmentID;
				this.shippingType = shippingType;
				this.shippingCost = shippingCost;
				this.shippingStatus = shippingStatus;
				this.order = order;
			}	
		} catch (ShipmentIDException | ShippingTypeException | ShippingStatusException | ShippingCostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// showDetails method from IShowDetails Interface
	@Override
	public void showDetails() {
		for(int i=0;i<50;i++) {
			System.out.print("*");
		}
		System.out.println("\n");
		System.out.println("Order ID:"+ this.order.orderID);
		System.out.println("Shipment ID:" + this.shipmentID);
		System.out.println("Shipment Type:" + this.shippingType);
		System.out.println("Shipment Cost:" + this.shippingCost);
		System.out.println("Shipment Status:" + this.shippingStatus);
		// Print *
		for(int i=0;i<50;i++) {
			System.out.print("*");
		}
	}
	
	// Validation Functions
	
	public boolean isValidShipmentID(String shipmentID) throws ShipmentIDException{
		if(shipmentID == "") {
			ShipmentIDException e = new ShipmentIDException();
			throw e;
		} else {
			return true;
		}
	}
	
	public boolean isValidShipmentCost(float shippingCost) throws ShippingCostException{
		if(shippingCost <=0) {
			ShippingCostException e = new ShippingCostException();
			throw e;
		} else {
			return true;
		}
	}
	
	public boolean isValidShippingType(char shippingType) throws ShippingTypeException{
		if(shippingType == 'P' || shippingType == 'C') {
			return true;
		} else {
			ShippingTypeException e = new ShippingTypeException();
			throw e;
		}
	}
	
	public boolean isValidShippingStatus(char shippingStatus) throws ShippingStatusException{
		if(shippingStatus == 'P' || shippingStatus == 'T') {
			return true;
		} else {
			ShippingStatusException e = new ShippingStatusException();
			throw e;
		}
	}
	
	// Value Updation Functions
	public void updateShippingType(char shippingType) {
		this.shippingType = shippingType;
		}
	
	public void updateShippingCost(float shippingCost) {
		this.shippingCost = shippingCost;
	}
	
	public void updateShippingStatus(char shippingStatus) {
		this.shippingStatus = shippingStatus;
	}
	

}
