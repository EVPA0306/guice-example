package com.evpa.guice.example.dao.result;

public interface Result {
    boolean wasSuccesful();
    String getDeclinedMessage();
}
