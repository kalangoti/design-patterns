package com.kti.design.patterns.strategy.within.services;

import com.kti.design.patterns.strategy.without.services.ShippingTnt;

public class ShippingTntImpl implements IShipping {

    @Override
    public Float calculate(Float weight) {
        float amount;
        ShippingTnt tnt = new ShippingTnt();
        amount = tnt.shippingPricecalculator(weight);
        return amount;
    }
}
