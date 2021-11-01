package com.kti.design.patterns.strategy.solution.services;

import com.kti.design.patterns.strategy.problem.services.ShippingCorreios;

/**
 * Strategy "concreta"
 */
public class ShippingPacImpl implements IShipping {

    @Override
    public Float calculate(Float weight) {
        float amount;
        ShippingCorreios correios = new ShippingCorreios();
        amount = correios.calculaRemessa("PAC", weight);
        return amount;
    }
}
