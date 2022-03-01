package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employ {
    @Id
    private int id;
    private String name;

    private String sur_Name;

    private String email;

    public employ(int id) {
    }

    public employ() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSur_Name() {
        return sur_Name;
    }

    public void setSur_Name(String sur_Name) {
        this.sur_Name = sur_Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "employ{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sur_Name='" + sur_Name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
