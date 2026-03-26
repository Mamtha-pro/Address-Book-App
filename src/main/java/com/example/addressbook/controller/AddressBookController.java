package com.example.addressbook.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @GetMapping
    public ResponseEntity<String> getAll() {
        return ResponseEntity.ok("Get All Contacts");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getById(@PathVariable int id) {
        return ResponseEntity.ok("Get Contact ID: " + id);
    }

    @PostMapping
    public ResponseEntity<String> create() {
        return ResponseEntity.ok("Contact Created");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable int id) {
        return ResponseEntity.ok("Updated ID: " + id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        return ResponseEntity.ok("Deleted ID: " + id);
    }
}