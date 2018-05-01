package com.evpa.guice.example.service;

import com.evpa.guice.example.dao.CreditCard;
import com.evpa.guice.example.dao.Receipt;
import com.evpa.guice.example.dao.order.PizzaOrder;
import com.evpa.guice.example.dao.result.Result;
import com.evpa.guice.example.log.TransactionLog;
import com.evpa.guice.example.processor.CreditCardProcessor;
import com.google.inject.Inject;

public class RealBillingService implements BillingService {

    private final CreditCardProcessor processor;
    private final TransactionLog transactionLog;

    @Inject
    public RealBillingService(CreditCardProcessor processor, TransactionLog transactionLog) {
        this.processor = processor;
        this.transactionLog = transactionLog;
    }

    @Override
    public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {
        Result chargeResult = processor.charge(creditCard, order.getAmount());
        transactionLog.logChargeResult(chargeResult);
        return chargeResult.wasSuccesful()
                ? Receipt.forSuccessfulCharge(order.getAmount())
                : Receipt.forDeclinedCharge(chargeResult.getDeclinedMessage());
    }
}
