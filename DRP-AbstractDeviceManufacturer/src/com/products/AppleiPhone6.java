package com.products;

import com.abstracts.InterPhone;

public class AppleiPhone6 extends ProductGUI implements InterPhone {

	String device_name = "Apple iPhone";
	
	@Override
	public String turnOn() {
		// TODO Auto-generated method stub
		return "Power on Apple iPhone6";
	}
	

	@Override
	public void testDevice(){
		System.out.println("testing of " + this.toString() + " finished");
	}

	@Override
	public String switchOff() {
		// TODO Auto-generated method stub
		return "Power off Apple iPhone6";
	}

}
