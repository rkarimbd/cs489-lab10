package cs489.miu.adsapi.service.Imp;

import cs489.miu.adsapi.model.Address;
import cs489.miu.adsapi.repository.AddressRepository;
import cs489.miu.adsapi.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressserviceImp implements AddressService {

    AddressRepository addressRepository;
    public AddressserviceImp(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }
    @Override
    public List<Address> getAddress() {
        return addressRepository.findAll();
    }

    @Override
    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }
}
