package com.backlab.lombok.reto.features;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class LombokTest {

    @Test
    void givenException_WhenUseBuilderLikeNonExperimentalFeature() {
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            Lombok.builder()
                    .featureName(Feature.SUPER_BUILDER)
                    .experimental(false)
                    .build();
        });

        assertEquals("Cannot use SUPER_BUILDER like non experimental feature", exception.getMessage());
    }

}
