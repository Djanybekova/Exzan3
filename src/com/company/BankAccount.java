package com.company;

public class BankAccount  {
    private double amount;


    public double getAmount() throws LimitException {
        if(amount>20000) throw new LimitException("Vy prevysili limit ",20000) ;
        while (amount>20000){
            System.out.println(withDraw(6000));
        }
        return 0;
    }


    public double deposit(double sum){
        return sum;
    }

    public int withDraw(int sum){
        return sum;

    }

}
