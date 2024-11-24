package com.space.suppourting.etity;


import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.stereotype.Component;

import javax.naming.Name;

@Entity
@Table(name = "students")
public class Student extends Member
{


    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Column(name = "UNI")
    private String university;


}
