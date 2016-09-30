package com.org.ems.service;

import java.util.List;

import com.org.ems.common.beans.Address;

public interface AddressService {

	public List<Address> fetchAddressListXml();
	public List<Address> fetchAddressListJson();
	public String updateAddress(Address address);
	public List<Address> getAddressByZip(String zip);
}
