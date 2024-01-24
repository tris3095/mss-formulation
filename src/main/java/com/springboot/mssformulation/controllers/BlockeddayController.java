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

import com.springboot.mssformulation.models.Blockedday;
import com.springboot.mssformulation.services.BlockeddayService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/blockedday")
@RequiredArgsConstructor
public class BlockeddayController {
    private final BlockeddayService blockeddayService;

    @GetMapping
    public ResponseEntity<Page<Blockedday>> getAll(@PageableDefault Pageable pageable) {
        return blockeddayService.getAll(pageable);
    }

    @GetMapping("{id}")
    public Blockedday getDetails(@PathVariable("id") Integer id) {
        return blockeddayService.getDetails(id);
    }

    @PostMapping
    public String create(@RequestBody Blockedday blockedday) {
        blockeddayService.create(blockedday);
        return "User Created Successfully";
    }

    @PutMapping
    public String update(@RequestBody Blockedday blockedday) {
        blockeddayService.update(blockedday);
        return "User Updated Successfully";
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable("id") Integer id) {
        blockeddayService.delete(id);
        return "User Deleted Successfully";
    }
}
