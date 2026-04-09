package com.stragure.users.model;


import lombok.Data;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "users")
public class Users {

    public Users() {
    }

    public Users(long id, String fistName, String email, int age) {
        this.id = id;
        this.fistName = fistName;
        this.email = email;
        this.age = age;
    }

    @Id
    private long id;

    @Column(name = "first_name")
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
