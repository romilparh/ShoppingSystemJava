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
		this.shipmentID = shipmentID;
		this.shippingType = shippingType;
		this.shippingCost = shippingCost;
		this.shippingStatus = shippingStatus;
		this.order = order;
	}
	
	// showDetails method from IShowDetails Interface
	@Override
	public void showDetails() {
		for(int i=0;i<50;i++) {
			System.out.print("*");
		}
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
	
	// Methods confined to ShipmentInfo Class
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
