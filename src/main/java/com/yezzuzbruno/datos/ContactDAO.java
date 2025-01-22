package com.yezzuzbruno.datos;

import com.yezzuzbruno.domain.Contact;

import java.util.ArrayList;

public class ContactDAO implements IContactDAO{

    @Override
    public ArrayList<Contact> listContacts() {
        return null;
    }

    @Override
    public boolean findContactById(Contact contact) {
        return false;
    }

    @Override
    public boolean addContact(Contact contact) {
        return false;
    }

    @Override
    public boolean modifyContact(Contact contact) {
        return false;
    }

    @Override
    public boolean deleteContact(Contact contact) {
        return false;
    }
}
