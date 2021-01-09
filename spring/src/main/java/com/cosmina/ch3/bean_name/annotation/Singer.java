package com.cosmina.ch3.bean_name.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("johnMayer")
@Trophy(name = {"grammy", "platinum disk"})
public class Singer {
    private String lyric = "We found a message in a bottle we were drinking";

    public void setLyric(@Value("I'm busted up but I'm loving every minute of it") String lyric) {
        this.lyric = lyric;
    }

    public void sing() {
        System.out.println(lyric);
    }
}
