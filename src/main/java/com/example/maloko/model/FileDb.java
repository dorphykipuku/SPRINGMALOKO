package com.example.maloko.model;

import javax.persistence.*;

@Entity
public class FileDb {
    @Id
    private String id;
    private String name;
    private String type;

    @Lob
    private byte[] data;

    public FileDb(String id, String name, String type, byte[] data) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.data = data;
    }




}
