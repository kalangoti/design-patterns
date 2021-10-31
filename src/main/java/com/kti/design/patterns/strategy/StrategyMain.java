package com.kti.design.patterns.strategy;

import com.kti.design.patterns.strategy.within.ShippingWithin;
import com.kti.design.patterns.strategy.within.services.ShippingFedexImpl;
import com.kti.design.patterns.strategy.within.services.ShippingPacImpl;
import com.kti.design.patterns.strategy.within.services.ShippingSedexImpl;
import com.kti.design.patterns.strategy.without.ShippingWithout;

public class StrategyMain {

    public static void main(String[] args) {
        System.out.println("\n*** Testando sem Design Patterns ***");
        ShippingWithout shippingWithout = new ShippingWithout();
        try {
            System.out.println("sedex: " + shippingWithout.calculate("sedex", 10f));
            System.out.println("fedex: " + shippingWithout.calculate("fedex", 11f));
            System.out.println("abc: " + shippingWithout.calculate("abc", 10f));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\n*** Testando com Design Patterns ***");


            ShippingWithin shippingWithin = new ShippingWithin(new ShippingSedexImpl());
            System.out.println("sedex: " + shippingWithin.calculate(10f));

            shippingWithin.setShipping(new ShippingFedexImpl());
            System.out.println("fedex: " + shippingWithin.calculate(11f));

            shippingWithin.setShipping(new ShippingPacImpl());
            System.out.println("pac: " + shippingWithin.calculate(11f));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
