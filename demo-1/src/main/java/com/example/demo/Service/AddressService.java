package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Address;
import com.example.demo.Model.Employee;
import com.example.demo.Repository.AddressRepository;

@Service
public class AddressService {
	@Autowired
	private AddressRepository addrepo;

	public List<Address> findall() {
		return addrepo.findAll();
	}

	public void save(Address addr) {
		addrepo.save(addr);
	}

	public Address findOne(Integer pin) {
		return addrepo.findOne(pin);
	}

}
