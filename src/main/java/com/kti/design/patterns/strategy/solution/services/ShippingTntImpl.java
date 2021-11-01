package com.kti.design.patterns.strategy.solution.services;

import com.kti.design.patterns.strategy.problem.services.ShippingTnt;

/**
 * Strategy "concreta"
 */
public class ShippingTntImpl implements IShipping {

    @Override
    public Float calculate(Float weight) {
        float amount;
        ShippingTnt tnt = new ShippingTnt();
        amount = tnt.shippingPricecalculator(weight);
        return amount;
    }
}
