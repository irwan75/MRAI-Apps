package com.example.mraiapps.dao;

public class daoLogin {

    private int stambuk;
    private String pass;
    private String rules;

    public daoLogin(int stambuk, String pass, String rules) {
        this.stambuk = stambuk;
        this.pass = pass;
        this.rules = rules;
    }

    public int getStambuk() {
        return stambuk;
    }

    public void setStambuk(int stambuk) {
        this.stambuk = stambuk;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }
}
