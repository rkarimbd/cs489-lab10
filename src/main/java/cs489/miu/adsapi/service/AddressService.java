package cs489.miu.adsapi.service;

import cs489.miu.adsapi.model.Address;

import java.util.List;

public interface AddressService {

    public List<Address> getAddress();

    public Address saveAddress(Address address);

}
