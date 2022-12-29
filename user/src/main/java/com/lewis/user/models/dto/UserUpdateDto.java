package com.lewis.user.models.dto;

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Required;

public class UserUpdateDto {


    private  Integer id;

    @NotNull
    private  String name;

    private String doc;

    public UserUpdateDto() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }
}
