package com.mmahu.payments.users.services;

import com.mmahu.payments.PaymentProvider;
import com.mmahu.payments.users.domain.User;

import java.util.Optional;

public interface UserService<U extends User> extends PaymentProvider {
    U register(U user);
    Optional<U> findById(String id);
}
