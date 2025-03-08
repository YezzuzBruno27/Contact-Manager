package com.yezzuzbruno.datos;

import com.yezzuzbruno.conexion.Conexion;
import com.yezzuzbruno.domain.Contact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ContactDAO implements IContactDAO{

    @Override
    public ArrayList<Contact> listContacts() {
        ArrayList<Contact> contacts = new ArrayList<>();
        PreparedStatement ps;
        ResultSet result;
        Connection connection = Conexion.getConexion();
        String query = "SELECT * FROM contact";
        try{
            ps = connection.prepareStatement(query);
            result = ps.executeQuery();
            while(result.next()){
                var contact = new Contact();
                contact.setId(result.getInt("id"));
                contact.setName(result.getString("name"));
                contact.setAge(result.getInt("age"));
                contact.setTelephone(result.getString("telephone"));
                contact.setOcuppation(result.getString("ocuppation"));
                contact.setDateAdded(result.getString("dateAdded"));
                contacts.add(contact);
            }
        }catch (SQLException e){
            System.out.println("Error listing contacts: " + e.getMessage());
        }finally {
            Conexion.closeConexion(connection);
        }
        return contacts;
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

    public static void main(String[] args) {
        System.out.println("LISTING CONTACTS");
        IContactDAO contactDAO = new ContactDAO();
        var contacts = contactDAO.listContacts();
        for(Contact c : contacts){
            System.out.println(c);
        }
    }
}
