package com.openthinks.libs.check.resource;

import java.io.InputStream;

/**
 * 资源文件工具类
 * 
 * @author dmj
 * 
 */
public class ResourceUtil {
  public static final String CHARACTER_NAME = "character.dat";
  public static final String DEFAULT_CHARACTER_PATH = "/META-INF/" + CHARACTER_NAME;

  /**
   * 返回相应路径文件的输入流
   * 
   * @param path 相应文件路径
   * @return InputStream 输入流
   */
  public static InputStream getResource(String path) {
    return ResourceUtil.class.getResourceAsStream(path);
  }

  public static InputStream getCharacterStream() {
    InputStream rootResource = getResource("/" + CHARACTER_NAME);
    if (rootResource == null) {
      return getResource(DEFAULT_CHARACTER_PATH);
    }
    return rootResource;
  }
}
