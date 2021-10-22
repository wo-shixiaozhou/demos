package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: demo
 * @description:
 * @author: kyle zhou1
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper tuserMapper;

    public User Select(User user) throws Exception {
        return tuserMapper.Select(user);
    }

    public String Add(User user) throws Exception {
        int a = tuserMapper.Add(user);
        if (a == 1) {
            return "添加成功";
        } else {
            return "添加失败";
        }
    }

    public String Update(User user) throws Exception {
        int a = tuserMapper.Update(user);
        if (a == 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }

    public String Delete(User user) throws Exception {
        int a = tuserMapper.Delete(user);
        if (a == 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }
}
