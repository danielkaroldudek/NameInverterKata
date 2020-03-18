package com.st.kata.nameinverter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NameInverterTest {

    private NameInverter nameInverter;

    @BeforeEach
    void setUp() {
        nameInverter = new NameInverter();
    }

    @Test
    void shouldThrowExceptionWhenNullProvided() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            nameInverter.invert(null);
        });
    }

    @Test
    void shouldReturnEmptyStringWhenWmptyStringGiven() {
        String inverted = nameInverter.invert("");
        assertThat(inverted).isEqualTo("");
    }
}
