package com.example.quickstart.entity;

import lombok.Data;

@Data
public class Left {
    private String time;
    private String title;
    private String introduce;
    private String picture;
    private String avatar;
    private String name;
    private int love;
    private int number;

    public Left(String avatar, String name, String time, String title, String introduce, String picture, int love, int number) {
        this.avatar = avatar;
        this.name = name;
        this.time = time;
        this.title = title;
        this.introduce = introduce;
        this.picture = picture;
        this.love = love;
        this.number = number;
    }

    public Left() {

    }
}
