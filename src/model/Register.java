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

public class Register {
    private IntegerProperty id_user;
    private StringProperty nama;
    private StringProperty no_hp;
    private StringProperty email;
    private StringProperty password;
    private StringProperty alamat;
    private StringProperty username;
    
    public Register() {
        this.id_user = new SimpleIntegerProperty();
        this.nama = new SimpleStringProperty();
        this.no_hp = new SimpleStringProperty();
        this.email = new SimpleStringProperty();
        this.password = new SimpleStringProperty();
        this.alamat = new SimpleStringProperty();
        this.username = new SimpleStringProperty();
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

    public String getNama() {
        return nama.get();
    }

    public void setNama(String nama) {
        this.nama.set(nama);
    }
    
    public StringProperty Nama() {
        return nama;
    }
    
    
    public String getNo_hp() {
        return no_hp.get();
    }

    public void setNo_hp(String phoneNumber) {
        this.no_hp.set(phoneNumber);
    }

    public StringProperty No_hp() {
        return no_hp;
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public StringProperty EmailProperty() {
        return email;
    }

    public String getAlamat() {
        return alamat.get();
    }

    public void setAlamat(String alamat) {
        this.alamat.set(alamat);
    }
    
    public StringProperty Alamat() {
        return alamat;
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
    
    public String getUsername() {
        return username.get();
    }

    public void setUsername(String username) {
        this.username.set(username);
    }
    
    public StringProperty Username() {
        return username;
    }
    
}