package com.org.ems.dao.impl;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import com.org.ems.common.beans.Address;
import com.org.ems.dao.AddressDao;

public class AddressDaoImpl extends BaseDaoImpl implements AddressDao {

	@Override
	public List<Address> fetchAddressList() {
		List<Address> addresses = null;
		try {
			final String fetchAddressQuery = "{CALL ems.sp_address_select()}";
			final CallableStatement fetchAddressListStmt = getConnection().prepareCall(fetchAddressQuery);
			final ResultSet rs = fetchAddressListStmt.executeQuery();
			addresses = new ArrayList<Address>();
			while(rs.next()) {
				final Address address = new Address();
				address.setAddressId(String.valueOf(rs.getInt("addressId")));
				address.setAddressLine1(rs.getString("addressLine1"));
				address.setAddressLine2(rs.getString("addressLine2"));
				address.setStreetName(rs.getString("streetName"));
				address.setLocationName(rs.getString("locationName"));
				address.setCityName(rs.getString("cityName"));
				address.setStateName(rs.getString("stateName"));
				address.setCountryName(rs.getString("countryName"));
				addresses.add(address);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return addresses;
	}

	@Override
	public int updateAddress(Address address) {
		int count = 0;
		final String updateAddress = "{call ems.sp_address_update(?,?,?,?,?)}";
		try {
			CallableStatement updateAddressStmt = getConnection().prepareCall(updateAddress);
			updateAddressStmt.setInt(1, Integer.parseInt(address.getAddressId()));
			updateAddressStmt.setString(2, address.getAddressLine1());
			updateAddressStmt.setString(3, address.getAddressLine2());
			updateAddressStmt.setString(4, address.getStreetName());
			updateAddressStmt.registerOutParameter(5, Types.INTEGER);
			count = updateAddressStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public List<Address> getAddressByZip(String zip) {
		return null;
	}

}
