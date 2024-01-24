package com.springboot.mssformulation.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import com.springboot.mssformulation.models.Clashinggroups;

public interface ClashinggroupsService {
    ResponseEntity<Page<Clashinggroups>> getAll(Pageable pageable);

    Clashinggroups getDetails(Integer id);

    String create(Clashinggroups clashinggroups);

    String update(Clashinggroups clashinggroups);

    String delete(Integer id);
}
