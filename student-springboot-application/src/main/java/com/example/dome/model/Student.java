package com.example.dome.model;


import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String Name;
    @Column(name = "email")
    private String email;
    @Column(name = "PhoneNo")
    private String Phone_No;

    public Student() {
    }

    public Student(String Name, String email, String Phone_No) {
        this.Name = Name;
        this.email = email;
        this.Phone_No = Phone_No;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_No() {
        return Phone_No;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone_No(String phone_No) {
        Phone_No = phone_No;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                ", Phone_No='" + Phone_No + '\'' +
                '}';
    }
}
