/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import javafx.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.RegisterDAO;
import util.konekDB;

public class RegisterController {
    @FXML
    private TextField nama;
    @FXML
    private TextField no_hp;
    @FXML
    private TextField email;
    @FXML
    private TextField password;
    @FXML
    private TextField alamat;
    @FXML
    private Executor exec;
    @FXML
    private Button signup;
    @FXML
    private Label notif;
    
    PreparedStatement pst = null;
    ResultSet rs = null;
    Connection conn = konekDB.koneksi();
    
    @FXML
    private void insertUser(ActionEvent actionEvent) throws SQLException, ClassNotFoundException{
        try{
             RegisterDAO.insertUser(nama.getText(),no_hp.getText(),email.getText(),password.getText(),alamat.getText());
             notif.setText("Employee inserted! \n");
        }catch(SQLException e){
            e.printStackTrace();
            notif.setText("Error occured while getting employee"
                    +"information from DB.\n"+e);
            throw e;
        }
    }
    
    @FXML
    private void initialize(){
        exec = Executors.newCachedThreadPool((runnable)->{
        Thread t = new Thread(runnable);
        t.setDaemon(true);
        return t;
    });
 
    }
}
