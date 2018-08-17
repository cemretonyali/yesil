package com.metod.java.training.projects.customer.commands;

import java.util.List;
import java.util.Scanner;

import com.metod.java.training.projects.customer.Account;
import com.metod.java.training.projects.customer.Customer;
import com.metod.java.training.projects.customer.EAccountType;

public class CustomerUtils {

    public static Account findAccount(final Customer customer, final EAccountType accountType) {
        List<Account> accounts = customer.getAccounts();
        for (Account account : accounts) {
            if (account.getAccountType() == accountType) {
                return account;
            }
        }
        return null;
    }

    public static void withdrawn(final Scanner scanner, final Customer customer, final EAccountType accountType) {
        Account account = CustomerUtils.findAccount(customer, accountType);
        if (account != null) {
            System.out.println(account);
        } else {
            System.out.println(accountType + " hesab�n�z yok.");
            return;
        }

        System.out.println(accountType + " hesab�n�zdan �ekece�iniz miktar� giriniz :");
        double amount = scanner.nextDouble();
        double currentAmount = account.getAmount();
        currentAmount -= amount;
        if (currentAmount < 0) {
            System.out.println(accountType + " Hesab�z�nda bu kadar para yok");
        } else {
            account.setAmount(currentAmount);
        }
        System.out.println(account);
    }

    public static void deposit(final Scanner scanner, final Customer customer, final EAccountType accountType) {
        Account account = CustomerUtils.findAccount(customer, accountType);
        if (account != null) {
            System.out.println(account);
        } else {
            System.out.println(accountType + " hesab�n�z yok.");
            return;
        }

        System.out.println(accountType + " hesab�n�za yat�raca��n�z miktar� giriniz :");
        double amount = scanner.nextDouble();
        double currentAmount = account.getAmount();
        currentAmount += amount;
        account.setAmount(currentAmount);
        System.out.println(account);
    }

    public static void showAccount(final Customer customer, final EAccountType accountType) {
        Account account = CustomerUtils.findAccount(customer, accountType);
        if (account != null) {
            System.out.println(account);
        } else {
            System.out.println(accountType + " hesab�n�z yok.");
        }

    }

}
