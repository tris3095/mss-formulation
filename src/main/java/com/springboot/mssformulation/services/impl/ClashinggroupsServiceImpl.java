package com.springboot.mssformulation.services.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot.mssformulation.models.Clashinggroups;
import com.springboot.mssformulation.repositories.ClashinggroupsRepository;
import com.springboot.mssformulation.services.ClashinggroupsService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClashinggroupsServiceImpl implements ClashinggroupsService {
    private final ClashinggroupsRepository clashinggroupsRepository;

    @Override
    public ResponseEntity<Page<Clashinggroups>> getAll(Pageable pageable) {
        return new ResponseEntity<>(clashinggroupsRepository.findAll(pageable),
                HttpStatus.OK);
    }

    @Override
    public Clashinggroups getDetails(Integer id) {
        return clashinggroupsRepository.findById(id).get();
    }

    @Override
    public String create(Clashinggroups clashinggroups) {
        clashinggroupsRepository.save(clashinggroups);
        return "Success";
    }

    @Override
    public String update(Clashinggroups clashinggroups) {
        clashinggroupsRepository.save(clashinggroups);
        return "Success";
    }

    @Override
    public String delete(Integer id) {
        clashinggroupsRepository.deleteById(id);
        return "Success";
    }
}
