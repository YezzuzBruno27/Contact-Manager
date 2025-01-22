package com.yezzuzbruno.datos;

import java.util.ArrayList;
import com.yezzuzbruno.domain.Contact;
public interface IContactDAO {
    ArrayList<Contact> listContacts();
    boolean findContactById(Contact contact);
    boolean addContact(Contact contact);
    boolean modifyContact(Contact contact);
    boolean deleteContact(Contact contact);
}
