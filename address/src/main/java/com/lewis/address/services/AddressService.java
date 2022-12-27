package com.lewis.address.services;


import com.lewis.address.feignClients.UserFeignClients;
import com.lewis.address.models.Address;
import com.lewis.address.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private UserFeignClients userFeign;



    public Address getAdress(Integer userId)
    {
        User user = userFeign.findById(userId).getBody();



    }
}
