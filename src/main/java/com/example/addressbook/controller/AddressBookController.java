package com.example.addressbook.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @GetMapping
    public String getMessage() {
        return "Address Book App is Working!";
    }
}
