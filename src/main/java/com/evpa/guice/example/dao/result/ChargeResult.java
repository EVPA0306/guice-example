package com.evpa.guice.example.dao.result;

public class ChargeResult implements Result {
    @Override
    public boolean wasSuccesful() {
        return true;
    }

    @Override
    public String getDeclinedMessage() {
        return "Payment was declined";
    }
}
