package com.example.dto;

public class Transaction {
    private String id;
    private String accountId;
    private double amount;
    
    public Transaction(String id, String accountId, double amount) {
        this.id = id;
        this.accountId = accountId;
        this.amount = amount;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getAccountId() {
        return accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

}
