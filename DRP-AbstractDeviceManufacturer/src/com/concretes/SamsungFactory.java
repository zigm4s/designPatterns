package com.concretes;

import com.abstracts.AbstractDeviceFactory;
import com.abstracts.InterPhone;
import com.abstracts.InterTV;
import com.abstracts.InterTablet;
import com.products.SamsungGalaxyS6;
import com.products.SamsungGalaxyTab;
import com.products.SamsungTV;

/**
 * Created by Zigmas on 12/6/2015.
 */
public class SamsungFactory implements AbstractDeviceFactory {

	@Override
	public InterTV ManufactureTV() {
		// TODO Auto-generated method stub
		return new SamsungTV();
	}

	@Override
	public InterPhone ManufacturePhone() {
		// TODO Auto-generated method stub
		return new SamsungGalaxyS6();
	}

	@Override
	public InterTablet ManufactureTablet() {
		// TODO Auto-generated method stub
		return new SamsungGalaxyTab();
	}
}
