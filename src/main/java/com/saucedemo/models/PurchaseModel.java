package com.saucedemo.models;


import java.util.List;


public class PurchaseModel {

    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String postalCode;

    public PurchaseModel(String userName, String password, String firstName, String lastName, String postalCode) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    public PurchaseModel(List<List<String>> listRegister) {
        this.userName = listRegister.get(0).get(0);
        this.password = listRegister.get(0).get(1);
        this.firstName = listRegister.get(0).get(2);
        this.lastName = listRegister.get(0).get(3);
        this.postalCode = listRegister.get(0).get(4);

    }

    public String getUsername() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

   public String getLastName() {
       return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

}
