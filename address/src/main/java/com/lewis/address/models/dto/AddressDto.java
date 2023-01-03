package com.lewis.address.models.dto;

import com.lewis.address.models.Address;

public class AddressDto {


    private Long id;

    private String city;

    private String country;


    private Integer userId;
    private String username;

    public AddressDto(Address address, String name) {
       this.id = address.getId();
       this.city = address.getCity();
       this.country = address.getCountry();
        this.username = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
