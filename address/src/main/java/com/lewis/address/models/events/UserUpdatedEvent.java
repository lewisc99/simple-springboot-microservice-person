package com.lewis.address.models.events;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.OffsetDateTime;


public class UserUpdatedEvent {

    private Integer id;

    private  String name;
    @JsonIgnore
    private OffsetDateTime date = OffsetDateTime.now();


    public UserUpdatedEvent() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserUpdatedEvent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }
}
