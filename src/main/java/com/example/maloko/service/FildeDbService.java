package com.example.maloko.service;

import com.example.maloko.model.FileDb;
import com.example.maloko.repository.FileDbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

@Service
public class FildeDbService {
    @Autowired
    private FileDbRepository fileDbRepository;

    public FileDb store(MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        FileDb fileDb = new FileDb(UUID.randomUUID().toString(), fileName, file.getContentType(), file.getBytes() );
        return fileDbRepository.save(fileDb);
    }
}
