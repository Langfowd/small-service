package com.ltf.studyspringboot.repository;

import com.ltf.studyspringboot.domin.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

@Repository
public class UserRepository {
    private DataSource masterDatasource;


    public UserRepository(DataSource masterDatasource, JdbcTemplate template) {
        this.masterDatasource = masterDatasource;
    }


    public List<User> getAllUser(){
        Connection connection = null;
        List<User> list = new LinkedList<>();
        try {
            connection = masterDatasource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select USER_NAME,PASSWORD from user");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String username = resultSet.getString(1);
                String passowrd = resultSet.getString(2);
                User user = new User();
                user.setPassword(passowrd);
                user.setUsername(username);
                list.add(user);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
