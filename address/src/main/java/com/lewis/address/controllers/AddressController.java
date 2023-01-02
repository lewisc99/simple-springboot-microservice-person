package com.lewis.address.controllers;

import com.lewis.address.models.dto.AddressDto;
import com.lewis.address.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/{userId}")
    public ResponseEntity<AddressDto> getAddress(@PathVariable Integer userId)
    {

       AddressDto addressDto =  addressService.getAddress(userId);

       if (addressDto == null)
       {
           return ResponseEntity.notFound().build();
       }
       return ResponseEntity.ok(addressDto);
    }


}
