package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

/**
 * @program: demo
 * @description:
 * @author: kyle zhou1
 **/
@Repository
public interface UserMapper {
    User Select(@Param("user") User user) throws SQLException;

    int Add(@Param("user") User user) throws SQLException;

    int Update(@Param("user") User user) throws SQLException;

    int Delete(@Param("user") User user) throws SQLException;
}
