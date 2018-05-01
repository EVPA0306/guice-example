package com.evpa.guice.example.processor;

import com.evpa.guice.example.dao.CreditCard;
import com.evpa.guice.example.dao.order.Order;
import com.evpa.guice.example.dao.result.ChargeResult;
import com.evpa.guice.example.dao.result.Result;

public class PaypalCreditCardProcessor implements CreditCardProcessor {
    @Override
    public Result charge(CreditCard creditCard, Double amount) {
        return new ChargeResult();
    }
}
