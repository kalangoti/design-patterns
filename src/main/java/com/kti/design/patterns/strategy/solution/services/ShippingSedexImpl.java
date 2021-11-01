package com.kti.design.patterns.strategy.solution.services;

import com.kti.design.patterns.strategy.problem.services.ShippingCorreios;

/**
 * Strategy "concreta"
 */
public class ShippingSedexImpl implements IShipping {

    @Override
    public Float calculate(Float weight) {
        float amount;
        ShippingCorreios correios = new ShippingCorreios();
        amount = correios.calculaRemessa("SEDEX", weight);
        return amount;
    }
}
