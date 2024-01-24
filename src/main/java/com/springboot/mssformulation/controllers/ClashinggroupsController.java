package com.springboot.mssformulation.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mssformulation.models.Clashinggroups;
import com.springboot.mssformulation.services.ClashinggroupsService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/clashinggroups")
@RequiredArgsConstructor
public class ClashinggroupsController {
    private final ClashinggroupsService clashinggroupsService;

    @GetMapping
    public ResponseEntity<Page<Clashinggroups>> getAll(@PageableDefault Pageable pageable) {
        return clashinggroupsService.getAll(pageable);
    }

    @GetMapping("{id}")
    public Clashinggroups getDetails(@PathVariable("id") Integer id) {
        return clashinggroupsService.getDetails(id);
    }

    @PostMapping
    public String create(@RequestBody Clashinggroups clashinggroups) {
        clashinggroupsService.create(clashinggroups);
        return "User Created Successfully";
    }

    @PutMapping
    public String update(@RequestBody Clashinggroups clashinggroups) {
        clashinggroupsService.update(clashinggroups);
        return "User Updated Successfully";
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable("id") Integer id) {
        clashinggroupsService.delete(id);
        return "User Deleted Successfully";
    }
}
