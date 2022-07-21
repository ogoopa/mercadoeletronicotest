package com.mecrudtest.mercadoeletronicotest.contacts.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "contacts", path = "contacts")
public interface ContactRepository extends JpaRepository<Contact, Long> {
}