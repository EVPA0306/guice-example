package com.evpa.guice.example.dao;

import com.evpa.guice.example.dao.result.ChargeResult;

public class Receipt  {

    public static Receipt forSuccessfulCharge(Double amount) {
        return new Receipt();
    }

    public static Receipt forDeclinedCharge(String message) {
        return new Receipt();
    }
}
