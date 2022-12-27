package com.lewis.address.repository;

import com.lewis.address.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {


       Optional<Address> findByUserId(Integer userId);
}
