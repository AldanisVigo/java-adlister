package com.codeup.adlister.dao;

import com.codeup.adlister.config.Config;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class UsersDao implements Users {

    Connection connection;

    public UsersDao() throws SQLException {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(Config.jdbcConnStr, Config.jdbcUsername, Config.jdbcPassword);
        }catch(SQLException e){
            System.out.println("Error while getting connection to MySQL in UsersDao constructor.");
            System.out.println(e.getMessage());
        }
    }

    @Override
    public User findByUsername(String username) {
        try{
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM User WHERE email = ?;");
            stmt.setString(1,username);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();
            if(rs.next()) {
                return new User(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getString("password")
                );
            }else{
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Long insert(User user) {
        try {
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO User(username,email,password,roles) VALUES(?,?,?,'USER');");
            stmt.setString(1,user.getUsername());
            stmt.setString(2,user.getEmail());
            stmt.setString(3,user.getPassword());

            stmt.executeUpdate();

            stmt.getResultSet().next();
            long id = stmt.getResultSet().getInt(0);
            return id;
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
