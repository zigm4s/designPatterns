package com.products;

import com.abstracts.InterTablet;

public class SamsungGalaxyTab extends ProductGUI implements InterTablet {

	@Override
	public String turnOn() {
		// TODO Auto-generated method stub
		return "Power on Samsung Galaxy Tab";
	}

	@Override
	public String switchOff() {
		// TODO Auto-generated method stub
		return "Power off Samsung Galaxy Tab";
	}

	@Override
	public void testDevice() {
		// TODO Auto-generated method stub
		System.out.println("testing of " + this.toString() + " finished");
	}

}
