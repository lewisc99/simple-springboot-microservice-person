package com.lewis.address.services;


import com.lewis.address.feignClients.UserFeignClients;
import com.lewis.address.models.Address;
import com.lewis.address.models.dto.AddressDto;
import com.lewis.address.models.User;
import com.lewis.address.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private UserFeignClients userFeign;

    @Autowired
    private AddressRepository repository;


    public AddressDto getAddress(Integer userId)  {
        User user = userFeign.findById(userId).getBody();

        Optional<Address> address =  repository.findByUserId(userId);

        if (address.isEmpty())
        {
            return null;
        }

        AddressDto addressDto = new AddressDto(address.get(), user.getName());

        return addressDto;

    }
}
