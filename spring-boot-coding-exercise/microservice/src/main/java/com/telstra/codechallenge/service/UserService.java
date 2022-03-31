package com.telstra.codechallenge.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.telstra.codechallenge.model.User;
import com.telstra.codechallenge.model.UserList;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Code By - Shubhamsingh Rajput
 * Date : 31-03-2022
 * Description : User Service, will process the logic where it takes the no of account and return the list.
 *               of them.
*/

@Service
public class UserService {

    @Value("${git.base.url}")
    private String gitBaseUrl;

    @Value("${git.path.url}")
    private String gitPath;

    public List<User> getOldUserAccounts(long AllNoOfAccounts) {
        RestTemplate restTemplate = new RestTemplate();
        UserList userModel = restTemplate.getForObject(getUri(), UserList.class);
        return userModel.getUsers()
                .stream()
                .limit(AllNoOfAccounts)
                .collect(Collectors.toList());

    }

    private URI getUri() {
        return UriComponentsBuilder.fromUriString(gitBaseUrl)
                .path(gitPath)
                .queryParam("q","followers:0")
                .queryParam("sort","joined")
                .queryParam("order","asc")
                .build()
                .encode().toUri();
    }
}
