package com.metod.java.training.projects.customer.commands;

import java.util.Scanner;

import com.metod.java.training.projects.customer.dao.Customer;
import com.metod.java.training.projects.customer.dao.EAccountType;

public class ShowDOLARCommand implements ICommand {

    @Override
    public void execute(final Scanner scanner, final Customer customer) {
        CustomerUtils.showAccount(customer, EAccountType.DOLAR);
    }

    @Override
    public String getDescription() {
        return "Dolar hesab�";
    }

}
