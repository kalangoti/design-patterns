package com.kti.design.patterns.strategy.problem.services;

public class ShippingCorreios {

    public Float calculaRemessa(String service, Float weight) {
        float amount = 0f;

        if (service.equals("PAC")) {
            amount = 10f * weight;
        } else if (service.equals("SEDEX")) {
            amount = 30f * weight;
        }

        return amount;
    }
}
