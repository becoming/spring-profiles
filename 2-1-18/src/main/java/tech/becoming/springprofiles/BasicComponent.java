package tech.becoming.springprofiles;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class BasicComponent {

    private final AppProperties properties;

    @PostConstruct
    public void init() {
        System.out.println("value 1 = " + properties.getValue1());
        System.out.println("value 2 = " + properties.getValue2());
        System.out.println("value 3 = " + properties.getValue3());
    }

}
