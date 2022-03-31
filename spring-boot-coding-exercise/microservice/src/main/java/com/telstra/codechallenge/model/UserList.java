package com.telstra.codechallenge.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UserList {

    @JsonProperty(value="items")
    List<User> users;

    public UserList() {
    }
    public UserList(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }
}
