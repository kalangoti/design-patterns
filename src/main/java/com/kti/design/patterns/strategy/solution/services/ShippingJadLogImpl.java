package com.kti.design.patterns.strategy.solution.services;

import com.kti.design.patterns.strategy.problem.services.ShippingJadLog;

/**
 * Strategy "concreta"
 */
public class ShippingJadLogImpl implements IShipping {

    @Override
    public Float calculate(Float weight) {
        float amount;
        ShippingJadLog jadLog = new ShippingJadLog();
        amount = jadLog.calculaFreteJadlog(weight);
        return amount;
    }
}
