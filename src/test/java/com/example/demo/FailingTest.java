package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FailingTest {

    @Test
    void failingTest() {
        assertThat(123).isEqualTo(124);
    }
}
