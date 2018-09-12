package com.busproject.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "registration")
public class Registration {


    @Id
    @Column(name = "username")
    private String userName;

    @Column(name = "firstname")
   private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "gender")
   private  String gender;
    @Column(name = "email")
   private String eMail;


    @Column(name = "password")
   private String password;

    public Registration()
    {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
