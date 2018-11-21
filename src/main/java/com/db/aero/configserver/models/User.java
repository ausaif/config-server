package com.db.aero.configserver.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    static final long serialVersionUID = 4L;
    @Id
    @Column(name = "username" ,nullable = false)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;

    protected User(){}

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User[" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ']';
    }
}
