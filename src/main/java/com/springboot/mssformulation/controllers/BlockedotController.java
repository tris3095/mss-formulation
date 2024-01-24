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

import com.springboot.mssformulation.models.Blockedot;
import com.springboot.mssformulation.services.BlockedotService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/blockedot")
@RequiredArgsConstructor
public class BlockedotController {
    private final BlockedotService blockedotService;

    @GetMapping
    public ResponseEntity<Page<Blockedot>> getAll(@PageableDefault Pageable pageable) {
        return blockedotService.getAll(pageable);
    }

    @GetMapping("{id}")
    public Blockedot getDetails(@PathVariable("id") Integer id) {
        return blockedotService.getDetails(id);
    }

    @PostMapping
    public String create(@RequestBody Blockedot blockedot) {
        blockedotService.create(blockedot);
        return "User Created Successfully";
    }

    @PutMapping
    public String update(@RequestBody Blockedot blockedot) {
        blockedotService.update(blockedot);
        return "User Updated Successfully";
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable("id") Integer id) {
        blockedotService.delete(id);
        return "User Deleted Successfully";
    }
}
