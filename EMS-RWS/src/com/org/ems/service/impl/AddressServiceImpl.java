
package com.org.ems.service.impl;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.org.ems.common.beans.Address;
import com.org.ems.dao.AddressDao;
import com.org.ems.dao.impl.AddressDaoImpl;
import com.org.ems.service.AddressService;

@Path("/addressService")
public class AddressServiceImpl implements AddressService {

	private AddressDao addressDao = new AddressDaoImpl();
	
	@GET
	@Path("/addresses/xml")
	@Produces(MediaType.APPLICATION_XML)
	@Override
	public List<Address> fetchAddressListXml() {
		List<Address> addresses = addressDao.fetchAddressList();
		return addresses;
	}

	@GET
	@Path("/addresses/json")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public List<Address> fetchAddressListJson() {
		List<Address> addresses = addressDao.fetchAddressList();
		return addresses;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("text/html")
	@Path("/update")
	@Override
	public String updateAddress(Address address) {
		String result = null;
		int count = addressDao.updateAddress(address);
		if (count == 0) {
			result = "failure";
		} else {
			result = "success";
		}
		return result;
	}

	@Override
	public List<Address> getAddressByZip(String zip) {
		return null;
	}
}
