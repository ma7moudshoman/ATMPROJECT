package org.example;

public class NoNameBank {



    private double balance;
    public void deposite(double amount)throws InvalidAmountException {
        if (amount<=0){
            throw new InvalidAmountException(amount + "is not valid");
        }else
            balance=balance+amount;
    }

    public double  withdraw(double amount)throws InsufficientFundsException{
        if (balance<amount){
            throw new InsufficientFundsException("InsufficientFundsException");
        }else
     balance=balance-amount;
        return amount;
    }

    public void balanceEnquiry(){
        System.out.println("current balance = " + balance);
    }
}
