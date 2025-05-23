package com.example.accounts;

public class Account {
    private String id;
    private String holderName;
    private double balance;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getHolderName() {
        return holderName;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

}
