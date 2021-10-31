package com.kti.design.patterns.strategy.within.services;

import com.kti.design.patterns.strategy.without.services.ShippingCorreios;

public class ShippingPacImpl implements IShipping {

    @Override
    public Float calculate(Float weight) {
        float amount;
        ShippingCorreios correios = new ShippingCorreios();
        amount = correios.calculaRemessa("PAC", weight);
        return amount;
    }
}
