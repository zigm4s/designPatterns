package com.abstracts;

/**
 * Created by Zigmas on 12/6/2015.
 */
public interface AbstractDeviceFactory {
    public InterTV ManufactureTV();
    public InterPhone ManufacturePhone();
    public InterTablet ManufactureTablet();

}
