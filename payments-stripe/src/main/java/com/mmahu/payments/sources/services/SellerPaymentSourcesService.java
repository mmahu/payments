package com.mmahu.payments.sources.services;

import com.mmahu.payments.sources.domain.PaymentSource;
import com.mmahu.payments.sources.domain.seller.SellerCard;
import com.mmahu.payments.users.domain.Seller;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class SellerPaymentSourcesService implements PaymentSourceService<Seller, PaymentSource<Seller>> {
    @Override
    public List<PaymentSource<Seller>> listSources(Seller user) {
        return Collections.singletonList(new SellerCard());
    }
}
