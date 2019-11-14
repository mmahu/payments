package com.mmahu.payments.sources.services;

import com.mmahu.payments.sources.domain.PaymentDestination;
import com.mmahu.payments.sources.domain.seller.SellerBankAccount;
import com.mmahu.payments.sources.domain.seller.SellerCard;
import com.mmahu.payments.users.domain.Seller;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SellerPaymentDestinationService implements PaymentDestinationService<Seller, PaymentDestination<Seller>> {

    @Override
    public List<PaymentDestination<Seller>> listDestinations(Seller user) {
        return Arrays.asList(new SellerBankAccount(), new SellerCard());
    }
}
