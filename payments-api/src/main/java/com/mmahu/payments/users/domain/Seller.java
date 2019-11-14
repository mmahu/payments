package com.mmahu.payments.users.domain;

import com.mmahu.payments.sources.domain.BankAccount;
import com.mmahu.payments.sources.domain.PaymentDestination;
import com.mmahu.payments.sources.domain.PaymentSource;
import com.mmahu.payments.sources.services.PaymentDestinationService;
import com.mmahu.payments.sources.services.PaymentSourceService;

import java.util.List;

public class Seller extends User {
    private PaymentSourceService<Seller, PaymentSource<Seller>> sourceService;
    private PaymentDestinationService<Seller, PaymentDestination<Seller>> destinationService;

    public List<PaymentSource<Seller>> listSources() {
        return sourceService.listSources(this);
    }

    public List<PaymentDestination<Seller>> listDestinations() {
        return destinationService.listDestinations(this);
    }
}
