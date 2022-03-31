package com.telstra.codechallenge.controller;

import com.telstra.codechallenge.model.User;
import com.telstra.codechallenge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * Code By - Shubhamsingh Rajput
 * Date : 31-03-2022
 * Description : UserController will the Number of Account which we want to fetch and return the list of user
 *               details.
*/


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(path = "/oldUserAccounts/{AllNoOfAccounts}", method = RequestMethod.GET)
    public List<User> oldUserAccounts(@PathVariable("AllNoOfAccounts") long AllNoOfAccounts) {
        return userService.getOldUserAccounts(AllNoOfAccounts);
    }
}

