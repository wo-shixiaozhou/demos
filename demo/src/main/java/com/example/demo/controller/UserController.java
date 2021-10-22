package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description:
 * @author: kyle zhou1
 **/
@RestController
@RequestMapping("/test")
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService tUserService;

    /**
     * 根据id查询
     *
     * @param user
     * @return
     * @throws Exception
     */
    @GetMapping(value = "/selectUserByid", produces = "application/json;charset=UTF-8")
    public String GetUser(User user) throws Exception {
        logger.info("根据id查询操作");
        return tUserService.Select(user).toString();
    }

    /**
     * 新增数据
     *
     * @param user
     * @return
     * @throws Exception
     */
    @GetMapping(value = "/add", produces = "application/json;charset=UTF-8")
    public String Add(User user) throws Exception {
        logger.info("新增数据操作");
        return tUserService.Add(user);
    }

    /**
     * 修改数据
     *
     * @param user
     * @return
     * @throws Exception
     */
    @GetMapping(value = "/update", produces = "application/json;charset=UTF-8")
    public String Update(User user) throws Exception {
        logger.info("修改数据操作");
        return tUserService.Update(user);
    }

    /**
     * 删除数据
     *
     * @param user
     * @return
     * @throws Exception
     */
    @GetMapping(value = "/delete", produces = "application/json;charset=UTF-8")
    public String Delete(User user) throws Exception {
        logger.info("删除数据操作");
        return tUserService.Delete(user);
    }

}
