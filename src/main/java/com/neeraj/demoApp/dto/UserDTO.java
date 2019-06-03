package com.neeraj.demoApp.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
