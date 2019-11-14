package com.mmahu.payments.sources.services;

import com.mmahu.payments.sources.domain.PaymentSource;
import com.mmahu.payments.sources.domain.buyer.BuyerCard;
import com.mmahu.payments.users.domain.Buyer;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BuyerPaymentSourcesService implements PaymentSourceService<Buyer, PaymentSource<Buyer>> {
    @Override
    public List<PaymentSource<Buyer>> listSources(Buyer user) {
        return Collections.singletonList(new BuyerCard());
    }
}
