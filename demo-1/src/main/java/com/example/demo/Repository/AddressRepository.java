package com.example.demo.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Address;

@Repository
@Transactional
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
