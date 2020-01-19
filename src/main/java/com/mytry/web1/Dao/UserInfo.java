package com.mytry.web1.Dao;

public class UserInfo {
    private final StringBuffer info;
    private String name;
    private int age;
    public UserInfo(String name, int age) {
        this.name = name;
        this.info = new StringBuffer(name);
        this.age = age;
    }

    public StringBuffer getInfo() {
        return info;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return info + "|" + name +"|" + age;
    }
}
