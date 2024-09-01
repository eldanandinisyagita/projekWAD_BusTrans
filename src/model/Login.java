/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Login {
    private IntegerProperty id_user;
    private StringProperty username;
    private StringProperty password;

    
    public Login() {
        this.id_user = new SimpleIntegerProperty();
        this.username = new SimpleStringProperty();
        this.password = new SimpleStringProperty();
    }

    public int getId_user() {
        return id_user.get();
    }

    public void setId_user(int id_user) {
        this.id_user.set(id_user);
    }
    
    public IntegerProperty Id_userproperty() {
        return id_user;
    }

    public String getUsername() {
        return username.get();
    }

    public void setUsername(String username) {
        this.username.set(username);
    }

    public StringProperty UsernameProperty() {
        return username;
    }
    
    public String getPassword() {
        return password.get();
    }

    public void setPassword(String password) {
        this.password.set(password);
    }
    
    public StringProperty Password() {
        return password;
    }
    
}
