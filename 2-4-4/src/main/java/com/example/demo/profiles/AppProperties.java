package com.example.demo.profiles;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
@ConfigurationProperties("app")
public class AppProperties {

    private String value1;
    private String value2;
    private String value3;

}
