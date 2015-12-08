package com.concretes;

import com.abstracts.AbstractDeviceFactory;
import com.abstracts.InterPhone;
import com.abstracts.InterTV;
import com.abstracts.InterTablet;
import com.products.AppleTV;
import com.products.AppleiPad;
import com.products.AppleiPhone6;

/**
 * Created by Zigmas on 12/6/2015.
 */
public class AppleFactory implements AbstractDeviceFactory{

	@Override
	public InterTV ManufactureTV() {
		// TODO Auto-generated method stub
		return new AppleTV();
	}

	@Override
	public InterPhone ManufacturePhone() {
		// TODO Auto-generated method stub
		return new AppleiPhone6();
	}

	@Override
	public InterTablet ManufactureTablet() {
		// TODO Auto-generated method stub
		return new AppleiPad();
	}
}
