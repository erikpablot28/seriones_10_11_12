package com.example.obspringsecurity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.yaml.snakeyaml.tokens.Token.ID.Key;
import static org.yaml.snakeyaml.tokens.Token.ID.Value;

//@SpringBootTest
class ObSpringSecurityApplicationTests {

    @Test
    void contextLoads() {
        System.getenv().forEach(
                (Key, Value) -> System.out.println(Key + " "+ Value)
        );

    }

}
