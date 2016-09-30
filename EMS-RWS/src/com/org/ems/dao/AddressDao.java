package com.org.ems.dao;

import java.util.List;

import com.org.ems.common.beans.Address;

public interface AddressDao {

	public List<Address> fetchAddressList();
	public int updateAddress(Address address);
	public List<Address> getAddressByZip(String zip);
}
