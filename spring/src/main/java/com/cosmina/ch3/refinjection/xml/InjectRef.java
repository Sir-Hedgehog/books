package com.cosmina.ch3.refinjection.xml;

import com.cosmina.ch3.refinjection.Oracle;

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
