package com.kti.design.patterns.strategy.solution;

import com.kti.design.patterns.strategy.solution.services.IShipping;

public class ShippingSolution {

    private IShipping shipping;

    public ShippingSolution(IShipping shipping) {
        this.shipping = shipping;
    }

    /**
     * Strategy Context - Principais motivações:
     * - Quando você precisa encapsular algoritmos similares para tomar alguma decisão;
     * - A classe que usa os algoritmos não é alterada, mesmo com outras opções de algoritmos;
     */
    public Float calculate(Float weight) {

        return shipping.calculate(weight);
    }

    public IShipping getShipping() {
        return shipping;
    }

    public void setShipping(IShipping shipping) {
        this.shipping = shipping;
    }
}
