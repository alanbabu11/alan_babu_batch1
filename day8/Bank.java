package day8;

import java.util.Scanner;

class Account{
    int amount;
    int balance;
    Account(int balance){
        this.balance = balance;
    }
    void deposit(int amount){
        balance += amount;
        System.out.println("Deposited amount "+ amount);
    }
    void withdraw(int amount){
        balance -= amount;
        System.out.println("Amount withdrawed "+ amount);
    }
    void getBalance(){
        System.out.println("Balance is : "+ balance);
    }
}


public class Bank{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account ac1 = new Account(1000);
        ac1.deposit(1000);
        ac1.withdraw(500);
        ac1.getBalance();
        sc.close();
    }
}