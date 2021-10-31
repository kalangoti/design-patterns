package com.kti.design.patterns.strategy.within;

import com.kti.design.patterns.strategy.within.services.IShipping;

public class ShippingWithin {

    private IShipping shipping;

    public ShippingWithin(IShipping shipping) {
        this.shipping = shipping;
    }

    /*
        Usando Strategy
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
