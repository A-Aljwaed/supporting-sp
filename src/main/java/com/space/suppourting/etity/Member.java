package com.space.suppourting.etity;


import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "Member")
@DiscriminatorColumn(name = "person_type", discriminatorType = DiscriminatorType.STRING)
public class Member {

    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status",nullable = false)
    private String status;

    public Member(String status, String firstName, String contact) {
        this.status = status;
        this.firstName = firstName;
        this.contact = contact;
    }

    public Member() {
    }
    @Column(name = "firstName",nullable = false)
    private String firstName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Column(name = "contact")
    private String contact;


}
