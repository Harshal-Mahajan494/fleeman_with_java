package com.example.models;

import jakarta.persistence.*;

@Entity
@Table(name = "AuthenticationTable")
public class AuthenticationTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Auth_Id;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(length = 18)
    private String Password;

    @Column(name = "role_id")
    private Integer role_id;

    public Integer getAuth_Id() {
        return Auth_Id;
    }

    public void setAuth_Id(Integer auth_Id) {
        Auth_Id = auth_Id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }
}
