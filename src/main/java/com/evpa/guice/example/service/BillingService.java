package com.evpa.guice.example.service;

import com.evpa.guice.example.dao.CreditCard;
import com.evpa.guice.example.dao.Receipt;
import com.evpa.guice.example.dao.order.PizzaOrder;

public interface BillingService {
    Receipt chargeOrder(PizzaOrder order, CreditCard creditCard);
}
