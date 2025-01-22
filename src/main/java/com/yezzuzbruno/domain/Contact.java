package com.yezzuzbruno.domain;

import java.util.Objects;

public class Contact {
    private int id;
    private String name;
    private int age;
    private String telephone;
    private String ocuppation;
    private String dateAdded;

    public Contact(){}
    public Contact(int id){
        this.id=id;
    }

    public Contact(String name, int age, String telephone, String ocuppation, String dateAdded) {
        this.name = name;
        this.age = age;
        this.telephone = telephone;
        this.ocuppation = ocuppation;
        this.dateAdded = dateAdded;
    }

    public Contact(int id, String name, int age, String telephone, String ocuppation, String dateAdded) {
        this(name,age,telephone,ocuppation, dateAdded);
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return id == contact.id && age == contact.age && Objects.equals(name, contact.name) && Objects.equals(telephone, contact.telephone) && Objects.equals(ocuppation, contact.ocuppation) && Objects.equals(dateAdded, contact.dateAdded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, telephone, ocuppation, dateAdded);
    }
}
