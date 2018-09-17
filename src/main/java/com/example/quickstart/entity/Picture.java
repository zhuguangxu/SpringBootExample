package com.example.quickstart.entity;

import lombok.Data;

@Data
public class Picture {
    private String name;
    private String explain;

    public Picture(String name, String explain) {
        this.name = name;
        this.explain = explain;
    }
    public Picture(){

    }
}
