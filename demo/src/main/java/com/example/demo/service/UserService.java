package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {

    User Select(User user) throws Exception;

    String Add(User user) throws Exception;

    String Update(User user) throws Exception;

    String Delete(User user) throws Exception;
}
