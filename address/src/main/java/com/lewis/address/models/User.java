package com.lewis.address.models;


public class User {


    private Integer id;

    private String name;

    private String doc;

    public User() {
    }

    public User(int id, String name, String doc) {
        this.id = id;
        this.name = name;
        this.doc = doc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }
}
