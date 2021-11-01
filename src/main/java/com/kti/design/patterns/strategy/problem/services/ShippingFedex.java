package com.kti.design.patterns.strategy.problem.services;

public class ShippingFedex {

    public Float shippingPrice(Float weight) {
        Float amount = 8.00f;

        return amount * weight;
    }
}
