package com.lewis.address.controllers;

import com.lewis.address.models.dto.AddressDto;
import com.lewis.address.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/address")
public class AddressController {


    @Autowired
    private AddressService addressService;

    @GetMapping("/{userId}")
    public ResponseEntity<AddressDto> getAddress(@PathVariable Integer userId)
    {

       AddressDto addressDto =  addressService.getAdress(userId);

       if (addressDto == null)
       {
           return ResponseEntity.notFound().build();
       }

       return ResponseEntity.ok(addressDto);
    }

}
