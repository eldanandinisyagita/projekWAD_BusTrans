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
import util.konekDB;

public class LoginController {
    
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private Executor exec;
    @FXML
    private Button login;
    @FXML
    private Label notif;

    PreparedStatement pst = null;
    ResultSet rs = null;
    Connection conn = konekDB.koneksi();
   
    
    @FXML
    private void actionMasuk(ActionEvent event) throws SQLException{
        //System.out.println(username.getText()+"-"+password.getText());
       // notif.setText("Maaf Username atau Password Tidak Cocok");
       String un = username.getText();
       String pw = password.getText();
       try{
           String query = "select * from user where username=? and password=?";
           pst = conn.prepareStatement(query);
           pst.setString(1, un);
           pst.setString(2, pw);
           
           rs = pst.executeQuery();
           
           if(rs.next()){
           notif.setText("Well Done");
           }else{
               notif.setText("Bad Done");
               }
           pst.close();
           rs.close();
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
