package it.develhope.cors_esercizio.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {
    @PostMapping("/revert")
    public String reverseName(@RequestParam(required = true) String name){
        StringBuilder stringBuilder = new StringBuilder(name).reverse();
        return stringBuilder.toString();
    }

    @GetMapping("/{name}")
    public String displayName(@PathVariable String name){
        return "hello" + name;
    }
}
