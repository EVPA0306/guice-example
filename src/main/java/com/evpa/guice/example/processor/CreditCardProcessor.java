package com.evpa.guice.example.processor;

import com.evpa.guice.example.dao.CreditCard;
import com.evpa.guice.example.dao.result.Result;

public interface CreditCardProcessor {
    Result charge(CreditCard creditCard, Double amount);
}
