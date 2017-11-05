package com.example.demo2;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.first.dao.UserRepository;
import com.example.demo2.first.model.User;
import com.example.demo2.second.dao.AddressRepository;
import com.example.demo2.second.model.Address;

@RestController
public class FirstSecondController {

	
	private final UserRepository userRepo;
	private final AddressRepository addrRepo;

	@Autowired
	public FirstSecondController(UserRepository userRepo, AddressRepository addrRepo) {
		this.userRepo = userRepo;
		this.addrRepo = addrRepo;
	}

	@GetMapping("/")
	public String fooBar() {
		User user = new User();
		Address address = new Address();
		user.setId(101);
		user.setName("riya");
		userRepo.save(user);
		address.setPin(111);
		address.setStreet("street1");
		addrRepo.save(address);

		List<User> userList = userRepo.findAll();
		List<Address> addList = addrRepo.findAll();

		return "userList : " + userList + "\n" + "addList: " + addList;
	}

}
