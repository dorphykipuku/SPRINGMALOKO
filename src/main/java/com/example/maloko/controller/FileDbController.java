package com.example.maloko.controller;

import com.example.maloko.model.FileDb;
import com.example.maloko.service.FildeDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("file")
public class FileDbController {
    @Autowired
    private FildeDbService fildeDbService;
    @PostMapping("pos")
    public FileDb uploadfile(@RequestParam("file") MultipartFile file) throws IOException {
     return fildeDbService.store(file);
    }
}
