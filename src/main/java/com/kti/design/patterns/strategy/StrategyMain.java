package com.kti.design.patterns.strategy;

import com.kti.design.patterns.strategy.solution.ShippingSolution;
import com.kti.design.patterns.strategy.solution.services.ShippingFedexImpl;
import com.kti.design.patterns.strategy.solution.services.ShippingPacImpl;
import com.kti.design.patterns.strategy.solution.services.ShippingSedexImpl;
import com.kti.design.patterns.strategy.problem.ShippingProblem;

public class StrategyMain {

    public static void main(String[] args) {
        System.out.println("\n*** Testando sem Design Patterns (PROBLEM) ***");
        ShippingProblem shippingWithout = new ShippingProblem();
        try {
            System.out.println("sedex: " + shippingWithout.calculate("sedex", 10f));
            System.out.println("fedex: " + shippingWithout.calculate("fedex", 11f));
            System.out.println("abc: " + shippingWithout.calculate("abc", 10f));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\n*** Testando com Design Patterns (SOLUTION) ***");


            ShippingSolution shippingWithin = new ShippingSolution(new ShippingSedexImpl());
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
