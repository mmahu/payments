package com.mmahu.payments.users.domain;

import com.mmahu.payments.sources.domain.PaymentSource;
import com.mmahu.payments.sources.services.PaymentSourceService;

import java.util.List;

public class Buyer extends User {
    private final PaymentSourceService<Buyer, PaymentSource<Buyer>> sourceService;

    public Buyer(PaymentSourceService<Buyer, PaymentSource<Buyer>> sourceService) {
        this.sourceService = sourceService;
    }

    public List<PaymentSource<Buyer>> listSources() {
        return sourceService.listSources(this);
    }

}
