package com.telstra.codechallenge.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * Code By - Shubhamsingh Rajput
 * Date : 31-03-2022
 * Description : User is model or DTO, where we have initialized our model which will be holding data.
*/

public class User {

   int id;
   String login;
   @JsonProperty(value="html_url")
   String htmlUrl;

    public User() {
    }

    public User(int id, String login, String htmlUrl) {
        this.id = id;
        this.login = login;
        this.htmlUrl = htmlUrl;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }
}
