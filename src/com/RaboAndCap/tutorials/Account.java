package com.RaboAndCap.tutorials;

public class Account {

    private int balance;
    private String bankName;
    private final String IBAN,accountHolder;

    public Account(int balance, String bankName, String IBAN, String accountHolder) {
        this.balance = balance;
        this.bankName = bankName;
        this.IBAN = IBAN;
        this.accountHolder = accountHolder;
    }

    public boolean checkBalance(int transferAmount) {
        return transferAmount <= balance;
    }


    public String getAccountHolder() {
        System.out.println(accountHolder);
        return accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public String getBankName() {
        System.out.println(bankName);
        return bankName;
    }

    public String getIBAN() {
        System.out.println(IBAN);
        return IBAN;
    }

    public void transferTo(int transferAmount, Account account) {
        if (transferAmount > balance) {
            System.out.println("Sorry, you have insufficient funds, we couldn't transfer " + transferAmount + " to " + account.accountHolder);
        } else {
            int transferMoney = balance - transferAmount;
            int receiveMoney = account.balance + transferAmount;
            System.out.println(accountHolder + " has transferred " + transferAmount + " to " + account.accountHolder);
            System.out.println("Your current balance is " + transferMoney);
            System.out.println();
            System.out.println();
            System.out.println("--ERROR CHECK-- The balance of the receiver is now " + receiveMoney);
        }
    }

    public void addMoney(int cashToAdd) {
        balance = balance + cashToAdd;
        System.out.println(cashToAdd + " has been added to your account");
        System.out.println("Your current balance is " + balance + " " + "On account name " + accountHolder);
    }

    public void deductMoney(int cashToDeduct) {
        balance = balance - cashToDeduct;
        System.out.println(cashToDeduct + " has been deducted from your account");
        System.out.println("Your current balance is " + balance + " " + "On account name " + accountHolder);
    }
}
