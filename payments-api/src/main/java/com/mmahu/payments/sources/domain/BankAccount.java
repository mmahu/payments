package com.mmahu.payments.sources.domain;

import com.mmahu.payments.users.domain.User;

public abstract class BankAccount<U extends User> implements PaymentDestination {
}
