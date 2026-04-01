package com.example.addressbook.service;




import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.model.AddressBook;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AddressBookService {

    private List<AddressBook> list = new ArrayList<>();
    private int count = 1;

    public List<AddressBook> getAll() {
        return list;
    }

    public AddressBook getById(int id) {
        return list.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    public AddressBook create(AddressBookDTO dto) {
        AddressBook obj = new AddressBook(count++, dto.getName(), dto.getAddress());
        list.add(obj);
        return obj;
    }

    public AddressBook update(int id, AddressBookDTO dto) {
        AddressBook obj = getById(id);
        if (obj != null) {
            obj.setName(dto.getName());
            obj.setAddress(dto.getAddress());
        }
        return obj;
    }

    public void delete(int id) {
        list.removeIf(e -> e.getId() == id);
    }
}