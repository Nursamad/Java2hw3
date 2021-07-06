package com.company;

public class BankAccount {
    private double amount;

    public void deposit(double sum) {
        amount += sum;
        System.out.println("On account: " + amount + "$");
    }

    public double getAmount() {
        return amount;
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("On account only: " + amount, amount);
        } else {
            amount -= sum;
            System.out.println("On account: " + amount + "$");
        }
    }
}
