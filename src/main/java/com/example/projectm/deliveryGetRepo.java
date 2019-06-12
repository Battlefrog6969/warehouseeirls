
package com.example.projectm;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface  deliveryGetRepo extends CrudRepository<deliveryGet, String> {

    List<deliveryGet> findAll();

}