package com.lewis.address.controllers;

import com.lewis.address.models.Address;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/address")
public class AddressController {


    @GetMapping("{userId}")
    public ResponseEntity<Address> getAddress()
    {

    }

}
