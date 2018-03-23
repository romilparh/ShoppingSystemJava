package romilparh;

public class ShipmentInfo extends Order implements ShowDetails{
	String shipmentID;
	char shippingType;
	float shippingCost;
	char shippingStatus;
	
	@Override
	public void showDetails() {
		for(int i=0;i<50;i++) {
			System.out.print("*");
		}
		System.out.println("Shipment ID:" + this.shipmentID);
		System.out.println("Shipment Type:" + this.shippingType);
		System.out.println("Shipment Cost:" + this.shippingCost);
		System.out.println("Shipment Status:" + this.shippingStatus);
		// Print *
		for(int i=0;i<50;i++) {
			System.out.print("*");
		}
	}
	
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
