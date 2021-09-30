package com.claretcrab.workshop_ddd.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Customer {
    private UUID id;
    private Address address;
    private List<Account> accounts;

    public Customer() {
        this.id = UUID.randomUUID();
        this.accounts = new ArrayList<>();
    }

    public Customer(Address address, List<Account> accounts) {
        this.id = UUID.randomUUID();
        this.address = address;
        this.accounts = accounts;
    }

    public void updateAddress(Address newAddress) {
        this.address = newAddress;
        for (Account account : accounts) {
            account.updateAddress(newAddress);
        }
    }
}
