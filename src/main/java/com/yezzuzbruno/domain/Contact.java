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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getOcuppation() {
        return ocuppation;
    }

    public void setOcuppation(String ocuppation) {
        this.ocuppation = ocuppation;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contact{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", telephone='").append(telephone).append('\'');
        sb.append(", ocuppation='").append(ocuppation).append('\'');
        sb.append(", dateAdded='").append(dateAdded).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
