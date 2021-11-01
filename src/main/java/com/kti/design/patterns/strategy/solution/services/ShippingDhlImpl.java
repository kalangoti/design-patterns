package com.kti.design.patterns.strategy.solution.services;

import com.kti.design.patterns.strategy.problem.services.ShippingDhl;

/**
 * Strategy "concreta"
 */
public class ShippingDhlImpl implements IShipping {

    @Override
    public Float calculate(Float weight) {
        float amount;
        ShippingDhl dhl = new ShippingDhl();
        amount = dhl.priceCalculator(weight);
        return amount;
    }
}
