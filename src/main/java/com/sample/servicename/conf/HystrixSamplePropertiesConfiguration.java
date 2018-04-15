package com.sample.servicename.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * A sample Hystrix configuration properties class provides easier access to a set of configuration
 * keys, which can be from different sources like application property file, OS environment
 * variables or others.
 *
 */
@Component
@ConfigurationProperties(prefix = "hystrix")
public class HystrixSamplePropertiesConfiguration {

  private Integer timeout = Integer.valueOf(10000);

  /**
   * As with {@link ConfigurationProperties} prefix, property name would be
   * <code>HYSTRIX_TIMEOUT</code>
   * 
   * @return
   */
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }
}
