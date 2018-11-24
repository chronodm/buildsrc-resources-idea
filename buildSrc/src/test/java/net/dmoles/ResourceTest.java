package net.dmoles;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;

public class ResourceTest {

  @Nested
  class Directly {
    @Test
    void canLoadMainResource() {
      var url = getClass().getResource("/phonemes.json");
      assertThat(url).isNotNull();
    }

    @Test
    void canLoadTestResource() {
      var url = getClass().getResource("/phoneme-t.json");
      assertThat(url).isNotNull();
    }
  }

  @Nested
  class FromCode {
    @Test
    void canLoadMainResource() {
      URL url = ResourceUtil.urlFor("/phonemes.json");
      assertThat(url).isNotNull();
    }

    @Test
    void canLoadTestResource() {
      URL url = ResourceUtil.urlFor("/phoneme-t.json");
      assertThat(url).isNotNull();
    }
  }
}
