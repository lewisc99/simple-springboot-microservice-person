package com.lewis.address.config.rabbitmq;

public class rabbitmqConstraints {

    public static final String USER_QUEUE_NAME = "user-updated-queue";
    public  static final String USER_EXCHANGE_NAME = "user.v1.events";
    public static final String USER_ROUTING_KEY = "user.*.key";
}
