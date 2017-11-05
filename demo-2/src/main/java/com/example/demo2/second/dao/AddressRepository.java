package com.example.demo2.second.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo2.second.model.Address;


@Repository
@Transactional
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
