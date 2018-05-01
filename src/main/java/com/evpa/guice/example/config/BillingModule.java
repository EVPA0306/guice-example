package com.evpa.guice.example.config;

import com.evpa.guice.example.log.DatabaseTransactionLog;
import com.evpa.guice.example.log.TransactionLog;
import com.evpa.guice.example.processor.CreditCardProcessor;
import com.evpa.guice.example.processor.PaypalCreditCardProcessor;
import com.evpa.guice.example.service.BillingService;
import com.evpa.guice.example.service.RealBillingService;
import com.google.inject.AbstractModule;

public class BillingModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(TransactionLog.class).to(DatabaseTransactionLog.class);
        bind(CreditCardProcessor.class).to(PaypalCreditCardProcessor.class);
        bind(BillingService.class).to(RealBillingService.class);
    }
}
