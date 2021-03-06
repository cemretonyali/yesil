package com.metod.java.training.projects.customer;

import java.util.Scanner;

import com.metod.java.training.projects.customer.processors.CustomerProcessorFactory;
import com.metod.java.training.projects.customer.processors.ICustomerProcessor;

public class CustomerMain {
    public static void main(final String[] args) {
        CustomerManager customerManager = new CustomerManager();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("username : ");
            String user = scanner.nextLine();
            System.out.println("password : ");
            String pass = scanner.nextLine();

            Customer customer = customerManager.getCustomer(user);
            if (customer != null) {
                String password = customer.getPassword();
                if (pass.equals(password)) {
                    ICustomerProcessor ccp = CustomerProcessorFactory.createCustomerProcessor(customer);
                    ccp.process(customer, scanner);
                } else {
                    System.out.println("Username yada Password yanl��");
                }
            } else {
                System.out.println("Username yada Password yanl��");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
