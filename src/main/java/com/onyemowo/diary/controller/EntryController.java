package com.onyemowo.diary.controller;

import com.onyemowo.diary.DTOS.APIResponse;
import com.onyemowo.diary.DTOS.EntryDTO;
import com.onyemowo.diary.services.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/onyemowo")
public class EntryController {
    @Autowired
    EntryService entryService;

    @PostMapping("/new")
    public ResponseEntity<?> newEntry(@RequestBody EntryDTO entryDTO){
        System.out.println("entry dto" + entryDTO);
        entryService.newEntry(entryDTO);
        return new ResponseEntity<>(new APIResponse(true, "Entry created ")
        , HttpStatus.CREATED);
    }
}
