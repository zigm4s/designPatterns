package com.products;

import com.abstracts.InterTablet;

public class AppleiPad extends ProductGUI implements InterTablet {
	
	String device_name = "Apple iPad";
	
	@Override
	public String turnOn() {
		// TODO Auto-generated method stub
		return "Power on Apple iPad";
	}

	@Override
	public String switchOff() {
		// TODO Auto-generated method stub
		return "Power off Apple iPad";
	}

	@Override
	public void testDevice() {
		// TODO Auto-generated method stub
		System.out.println("testing of " + this.toString() + " finished");
	}

}
