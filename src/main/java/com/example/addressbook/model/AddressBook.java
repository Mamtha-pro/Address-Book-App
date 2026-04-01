package com.example.addressbook.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressBook {
    private int id;
    private String name;
    private String address;
}
