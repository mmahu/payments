package com.mmahu.payments.sources.domain;

import com.mmahu.payments.users.domain.User;

public abstract class Card<U extends User> implements PaymentSource, PaymentDestination {
}
