package com.cosmina.ch3.ref_injection.xml;

import com.cosmina.ch3.ref_injection.Oracle;

public class InjectRef {
    private Oracle oracle;

    public void setOracle(Oracle oracle) {
        this.oracle = oracle;
    }

    @Override
    public String toString() {
        return oracle.defineMeaningOfLife();
    }
}
