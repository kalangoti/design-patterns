package com.kti.design.patterns.strategy.solution.services;

import com.kti.design.patterns.strategy.problem.services.ShippingFedex;

/**
 * Strategy "concreta"
 */
public class ShippingFedexImpl implements IShipping {

    @Override
    public Float calculate(Float weight) {
        float amount;
        ShippingFedex fedex = new ShippingFedex();
        amount = fedex.shippingPrice(weight);
        return amount;
    }
}
