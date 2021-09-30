package com.claretcrab.workshop_ddd.bank;

import java.util.UUID;

public class Account {

    private UUID id;
    private Address address;

    public Account() {
        this.id = UUID.randomUUID();
    }

    public void updateAddress(Address newAddress) {
        this.address = newAddress;
    }
    
}
