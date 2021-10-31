package com.kti.design.patterns.strategy.without.services;

public class ShippingFedex {

    public Float shippingPrice(Float weight) {
        Float amount = 8.00f;

        return amount * weight;
    }
}
