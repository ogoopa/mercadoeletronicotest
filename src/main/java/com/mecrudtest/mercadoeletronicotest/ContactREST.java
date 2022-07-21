package com.mecrudtest.mercadoeletronicotest;

import com.mecrudtest.mercadoeletronicotest.contacts.models.Contact;
import com.mecrudtest.mercadoeletronicotest.contacts.database.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactREST {
    @Autowired
    private ContactRepository repository;

    @GetMapping
    public List<Contact> listContacts() {
        return repository.findAll();
    }

    @PostMapping
    public void saveContact(@RequestBody Contact contact) {
        repository.save(contact);
    }

    @PutMapping
    public void updateContact(@RequestBody Contact contact) {
        if(contact.getId()>0)
            repository.save(contact);
    }

    @DeleteMapping
    public void deleteContact(@RequestBody Contact contact) {
        repository.delete(contact);
    }

}
