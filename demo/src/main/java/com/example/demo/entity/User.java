package com.example.demo.entity;

import lombok.Data;

/**
 * @program: demo
 * @description:
 * @author: kyle zhou1
 **/
@Data
public class User {
    //主键id
    private Integer id;

    //登录用户名
    private String username;

    //登陆密码
    private String password;

    //地址
    private String address;
    
}
