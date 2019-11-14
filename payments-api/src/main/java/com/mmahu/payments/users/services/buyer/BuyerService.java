package com.mmahu.payments.users.services.buyer;

import com.mmahu.payments.users.domain.Buyer;
import com.mmahu.payments.users.services.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BuyerService implements UserService<Buyer> {
    @Override
    public Buyer register(Buyer user) {
        return null;
    }

    @Override
    public Optional<Buyer> findById(String id) {
        return Optional.empty();
    }
}
