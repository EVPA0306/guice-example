package com.evpa.guice.example.log;

import com.evpa.guice.example.dao.result.Result;

public interface TransactionLog {
    void logChargeResult(Result result);
}
