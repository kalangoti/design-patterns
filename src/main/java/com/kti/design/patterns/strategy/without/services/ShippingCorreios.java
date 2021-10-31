package com.kti.design.patterns.strategy.without.services;

public class ShippingCorreios {

    public Float calculaRemessa(String service, Float weight) {
        float valor = 0f;

        if (service.equals("PAC")) {
            valor = 10f * weight;
        } else if (service.equals("SEDEX")) {
            valor = 30f * weight;
        }

        return valor;
    }
}
