package com.mecrudtest.mercadoeletronicotest.contacts.database;

import com.mecrudtest.mercadoeletronicotest.contacts.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "contacts", path = "contacts")
public interface ContactRepository extends JpaRepository<Contact, Long> {
    @Override
    <S extends Contact> S save(S entity);

    @Override
    Optional<Contact> findById(Long aLong);

    @Override
    List<Contact> findAll();

    @Override
    void delete(Contact entity);
}
