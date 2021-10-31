package com.kti.design.patterns.strategy.within.services;

import com.kti.design.patterns.strategy.without.services.ShippingJadLog;

public class ShippingJadLogImpl implements IShipping {

    @Override
    public Float calculate(Float weight) {
        float amount;
        ShippingJadLog jadLog = new ShippingJadLog();
        amount = jadLog.calculaFreteJadlog(weight);
        return amount;
    }
}
