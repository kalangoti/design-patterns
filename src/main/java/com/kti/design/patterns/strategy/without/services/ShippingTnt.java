package com.kti.design.patterns.strategy.without.services;

public class ShippingTnt {

    public Float shippingPricecalculator(Float weight) {
        Float amount = 12.50f;

        return amount * weight;
    }
}
