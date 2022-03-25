package com.example.capstone.controller;

import com.example.capstone.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/shop")
    public List itemBuy() {
        List items = itemRepository.findAll();
        return items;
    }
}
