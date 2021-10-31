package com.kti.design.patterns.strategy.without;

import com.kti.design.patterns.strategy.without.services.*;

public class ShippingWithout {

    /*
        Fazendo na mão e quebrando o principio do SOLID -> (O) OPEN-CLOSED PRINCIPLE
        (Aberto para extensão e fechado para alteração)
     */
    public Float calculate(String service, Float weight) throws Exception {
        Float amount;

        switch (service) {
            case "sedex": {
                ShippingCorreios correios = new ShippingCorreios();
                amount = correios.calculaRemessa("SEDEX", weight);
                break;
            }
            case "pac": {
                ShippingCorreios correios = new ShippingCorreios();
                amount = correios.calculaRemessa("PAC", weight);
                break;
            }
            case "jadlog":
                ShippingJadLog jadLog = new ShippingJadLog();
                amount = jadLog.calculaFreteJadlog(weight);
                break;
            case "dhl":
                ShippingDhl dhl = new ShippingDhl();
                amount = dhl.priceCalculator(weight);
                break;
            case "fedex":
                ShippingFedex fedex = new ShippingFedex();
                amount = fedex.shippingPrice(weight);
                break;
            case "tnt":
                ShippingTnt tnt = new ShippingTnt();
                amount = tnt.shippingPricecalculator(weight);
                break;
            default:
                throw new Exception("Serviço de frete inválido");
        }

        return amount;
    }
}
