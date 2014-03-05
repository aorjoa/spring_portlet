package com.t2decode.sample.service;
import java.util.List;
import com.t2decode.sample.domain.Contact;;

public interface ContactService {
    public void addContact(Contact contact);
    public List<Contact> listContact();
    public void removeContact(Integer id);
}
