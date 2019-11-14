package com.mmahu.payments.users.services.seller;

import com.mmahu.payments.users.domain.Seller;
import com.mmahu.payments.users.services.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SellerService implements UserService<Seller> {
    @Override
    public Seller register(Seller user) {
        return null;
    }

    @Override
    public Optional<Seller> findById(String id) {
        return Optional.empty();
    }
}
