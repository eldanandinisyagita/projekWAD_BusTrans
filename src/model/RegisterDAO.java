/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import util.konekDB;

public class RegisterDAO {
    public static void insertUser(String nama, String no_hp, String email, String password, String username) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt
                = "INSERT INTO user"
                + "(nama, no_hp, email, password, username) "
                + "VALUES "
                + "('" + nama + "', '" + no_hp + "', '"  + email + "','" + password + "','" + username + "' )";

        //Execute DELETE operation
        try {
            konekDB.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while DELETE Operation: " + e);
            throw e;
        }
    }
}
