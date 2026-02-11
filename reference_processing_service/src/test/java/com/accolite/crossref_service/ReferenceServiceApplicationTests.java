package com.accolite.crossref_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class ReferenceServiceApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("test is running");
    }

}
