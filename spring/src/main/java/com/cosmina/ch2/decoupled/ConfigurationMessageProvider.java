package com.cosmina.ch2.decoupled;

import com.cosmina.ch2.hello.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("provider")
public class ConfigurationMessageProvider implements MessageProvider {

    private String message;

    /*@Autowired
    public ConfigurationMessageProvider(@Value("Configurable message")String message) {
        this.message = message;
    }*/

    @Autowired
    public ConfigurationMessageProvider(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
