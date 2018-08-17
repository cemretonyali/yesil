package com.metod.java.training.customer.atm;

public class CustomerFactory {
    public static ICustomer createCustomer(final int index) throws AtmException {
        switch (index) {
        case 1:
            return new GumusCustomer();
        case 2:
            return new AltinCustomer();
        case 3:
            return new PlatinCustomer();

        default:
            throw new AtmException("yanl�� girdi");
        }
    }

    public static void writeCustomerTypeMenu() {
        System.out.println("1-G�m��");
        System.out.println("2-Alt�n");
        System.out.println("3-Platin");
        System.out.println("Se�iminiz : ");
    }
}
