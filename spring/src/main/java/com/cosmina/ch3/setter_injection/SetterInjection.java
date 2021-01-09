package com.cosmina.ch3.setter_injection;

import com.cosmina.ch3.cdl.Dependency;

public class SetterInjection {
    private Dependency dependency;

    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }

    @Override
    public String toString() {
        return dependency.toString();
    }
}
