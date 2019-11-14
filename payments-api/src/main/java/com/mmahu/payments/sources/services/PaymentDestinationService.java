package com.mmahu.payments.sources.services;

import com.mmahu.payments.PaymentProvider;
import com.mmahu.payments.sources.domain.PaymentDestination;
import com.mmahu.payments.users.domain.User;

import java.util.List;

public interface PaymentDestinationService<U extends User,  P extends PaymentDestination<U>> extends PaymentProvider {
    List<P> listDestinations(U user);
}
