package com.mmahu.payments.sources.services;

import com.mmahu.payments.PaymentProvider;
import com.mmahu.payments.sources.domain.PaymentSource;
import com.mmahu.payments.users.domain.User;

import java.util.List;

public interface PaymentSourceService<U extends User, P extends PaymentSource<U>> extends PaymentProvider {
    List<P> listSources(U user);
}
