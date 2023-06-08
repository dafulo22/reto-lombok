package com.backlab.lombok.reto.features;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ChapterTest {

    @Test
     void whenCreateChapter_ThenReturnAllAttributes() {
        Chapter build = new Chapter().toBuilder()
            .build();
        Assertions.assertThat(build.getName()).isEqualTo("Backlab");
        Assertions.assertThat(build.getOriginal()).isTrue();
        Assertions.assertThat(build.getHour()).isEqualTo(11);
    }

    @Test
     void whenCreateChapter_ThenReturnTheSameInToBuilder() {
        Chapter build = new Chapter().toBuilder()
            .build();
        Chapter pojo = new Chapter();
        Assertions.assertThat(build.getName()).isEqualTo(pojo.getName());
        Assertions.assertThat(build.getOriginal()).isEqualTo(pojo.getOriginal());
    }

}
