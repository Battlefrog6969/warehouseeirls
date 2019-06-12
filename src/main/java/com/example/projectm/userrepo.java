package com.example.projectm;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface userrepo extends CrudRepository<user, String> {

    List<user> findAll();

    
    

}