package com.example.automation;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

// @TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Annotations {

    @Test
    void testAnnotation(){
        System.out.println("Test Annotation");
    }

    @BeforeAll
    static void beforeAllAnnotation(){
        System.out.println("Before All Annotation");
    }

    @AfterAll
    static void afterAllAnnotation(){
        System.out.println("After All Annotation");
    }

    @BeforeEach
    void beforeEachAnnotation(){
        System.out.println("Before Each Annotation");
    }

    @AfterEach
    void afterEachAnnotation(){
        System.out.println("After Each Annotation");
    }

    @Test
    @Disabled
    void disabledAnnotation(){
        System.out.println("Disabled Annotation - If you want a test to be appeared as skipped in reports");
    }

    @Test
    @DisplayName("This test case will display name")
    void displayNameAnnotation(){
        System.out.println("Display Name Annotation");
    }

}
