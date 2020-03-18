package com.st.kata.nameinverter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameInverterTest {

    @Test
    void shouldThrowExceptionWhenNullProvided() {
        NameInverter nameInverter = new NameInverter();
        Assertions.assertThrows(NullPointerException.class, () -> {
            nameInverter.invert(null);
        });
    }
}
