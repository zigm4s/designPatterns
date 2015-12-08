package com.products;

import com.abstracts.InterTV;

public class AppleTV extends ProductGUI implements InterTV {

	String device_name = "Apple TV";
	
	@Override
	public String turnOn() {
		// TODO Auto-generated method stub
		return "Apple TV Power on";
	}

	@Override
	public String switchOff() {
		// TODO Auto-generated method stub
		return "Apple TV Power off";
	}

	@Override
	public void testDevice() {
		// TODO Auto-generated method stub
		System.out.println("testing of " + this.toString() + " finished");
	}

}
