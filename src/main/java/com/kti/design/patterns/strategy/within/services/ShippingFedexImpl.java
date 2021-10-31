package com.kti.design.patterns.strategy.within.services;

import com.kti.design.patterns.strategy.without.services.ShippingFedex;

public class ShippingFedexImpl implements IShipping {

    @Override
    public Float calculate(Float weight) {
        float amount;
        ShippingFedex fedex = new ShippingFedex();
        amount = fedex.shippingPrice(weight);
        return amount;
    }
}
