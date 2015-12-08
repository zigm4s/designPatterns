package com.products;

import com.abstracts.InterTV;

public class SamsungTV extends ProductGUI implements InterTV {

	@Override
	public String turnOn() {
		// TODO Auto-generated method stub
		return "Turn on Samsung TV";
	}

	@Override
	public String switchOff() {
		// TODO Auto-generated method stub
		return "Turn off Samsung TV";
	}

	@Override
	public void testDevice() {
		// TODO Auto-generated method stub
		System.out.println("testing of " + this.toString() + " finished");
	}

}
