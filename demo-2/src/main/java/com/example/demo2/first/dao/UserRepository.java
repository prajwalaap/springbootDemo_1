package com.example.demo2.first.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo2.first.model.User;


@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {

}
