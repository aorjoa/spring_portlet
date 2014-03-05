package com.t2decode.sample.dao;

import java.util.List;
import com.t2decode.sample.domain.Contact;

public interface ContactDAO {
    
    public void addContact(Contact contact);
    public List<Contact> listContact();
    public void removeContact(Integer id);
}
