package com.kti.design.patterns.strategy.within.services;

import com.kti.design.patterns.strategy.without.services.ShippingDhl;

public class ShippingDhlImpl implements IShipping {

    @Override
    public Float calculate(Float weight) {
        float amount;
        ShippingDhl dhl = new ShippingDhl();
        amount = dhl.priceCalculator(weight);
        return amount;
    }
}
