package testNGImplementation;

import org.testng.annotations.Test;

public class DependenciesInTestNG {
	static String trackingNumber = null;

	@Test
	public void createShipment() {
		System.out.println("create Shipmenty");
		trackingNumber = "123ABC";
	}

	@Test(dependsOnMethods = {"createShipment"})
	public void trackShipment() throws Exception {
		System.out.println("track Shipment");
		if (trackingNumber != null) {
			System.out.println("Track Shipment");
		} else {
			throw new Exception("Tracking number not Exits");
		}
	}

	@Test(dependsOnMethods = {"trackShipment"})
	public void cancleShipment() throws Exception {
		System.out.println("cancel Shipment");
		if (trackingNumber != null) {
			System.out.println("cancel shipment");
		} else {
			throw new Exception("Tracking number not Exits");

		}
	}
}
