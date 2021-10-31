package com.kti.design.patterns.strategy.without.services;

public class ShippingDhl {

    public Float priceCalculator(Float weight) {
        Float amount = 6.99f;

        return amount * weight;
    }
}
