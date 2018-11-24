package net.dmoles;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.fail;

public class FailingTest {
  @Test
  void failFails() {
    fail("fail");
  }
}
