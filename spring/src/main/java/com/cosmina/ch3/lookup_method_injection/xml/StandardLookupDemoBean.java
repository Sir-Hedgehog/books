package com.cosmina.ch3.lookup_method_injection.xml;

import com.cosmina.ch3.lookup_method_injection.xml.DemoBean;
import com.cosmina.ch3.lookup_method_injection.xml.Singer;

public class StandardLookupDemoBean implements DemoBean {

    private Singer mySinger;

    public void setMySinger(Singer mySinger) {
        this.mySinger = mySinger;
    }

    @Override
    public Singer getMySinger() {
        return this.mySinger;
    }

    @Override
    public void doSomething() {
        mySinger.sing();
    }
}
