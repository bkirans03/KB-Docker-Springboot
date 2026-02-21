package com.stragure.users.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data

public class Users {

    public Users() {
    }

    public Users(long id, String fistName, String email, int age) {
        this.id = id;
        this.fistName = fistName;
        this.email = email;
        this.age = age;
    }

    private long id;
    private String fistName;
    private String email;
    private int age;


    public long getId() {
        return id;
    }

    public String getFistName() {
        return fistName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", fistName='" + fistName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
