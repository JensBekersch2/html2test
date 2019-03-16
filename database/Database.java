package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import logging.LogfileManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import models.Project;
import models.User;
import models.UserAuth;

public class Database {

    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;

    final String dbUrl = "jdbc:mysql://localhost/html2test?";
    final String dbUsername = "root";
    final String dbPassword = "root";

    public Database() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch(Exception e) {
            LogfileManager.logWarn("Database Driver could not be loaded!");
        }
    }

    public Connection connect() {
        try {
            connection = DriverManager.getConnection(dbUrl +
                    "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&" +
                    "user="+dbUsername+"&password="+dbPassword);
        } catch (SQLException e) {
            LogfileManager.logWarn("Database Connection could not be etablished!");
        }
        return connection;
    }

    public User getUser(int id) {
        User user = new User();
        connect();
        String getUserById = "SELECT id, userName, firstName, lastName, email, password FROM user WHERE id = ?";
        try {
            statement = connection.prepareStatement(getUserById);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
            while(resultSet.next()) {
                user.setId(resultSet.getInt(1));
                user.setUserName(resultSet.getString(2));
                user.setFirstName(resultSet.getString(3));
                user.setLastName(resultSet.getString(4));
                user.setEmail(resultSet.getString(5));
                user.setPassword(resultSet.getString(6));
            }
        } catch (SQLException e) {
            LogfileManager.logWarn("getUser: SQLException" + e);
        }
        return user;
    }

    public UserAuth getUserAuth(String username) {
        UserAuth user = new UserAuth();
        connect();
        String getUserByName = "SELECT DISTINCT id, username, password FROM user WHERE username = ?";
        try {
            statement = connection.prepareStatement(getUserByName);
            statement.setString(1, username);
            resultSet = statement.executeQuery();
            while(resultSet.next()) {
                user.setId(resultSet.getInt(1));
                user.setUserName(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));
            }
        } catch (SQLException e) {
            LogfileManager.logWarn("getUserAuth: SQLException" + e);
        }
        return user;
    }

    public List getProjects(int userId) {
        List<Project> projects = new ArrayList<Project>();
        return null;
    }


}
