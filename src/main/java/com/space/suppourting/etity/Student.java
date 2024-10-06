package com.space.suppourting.etity;


import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.naming.Name;

@Entity
@Table(name = "studnets")
public class Student
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public Student(String name, String address, String eMail) {
        this.name = name;
        this.address = address;
        this.eMail = eMail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    @Column(name = "Name",nullable = false)
    private String name;
    @Column(name = "Address")
    private String address;
    @Column (name = "email")
    private String eMail;




}
