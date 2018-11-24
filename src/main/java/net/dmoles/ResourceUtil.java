package net.dmoles;

import java.net.URL;

public class ResourceUtil {
  static URL urlFor(String resource) {
    return ResourceUtil.class.getResource("/phonemes.json");
  }
}
