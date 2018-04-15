package com.sample.servicename.resources;

import javax.annotation.PreDestroy;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

@Component
public class SampleComponent implements SmartLifecycle {

  private String value;

  public SampleComponent() {}

  public SampleComponent(String value) {
    this.value = value;
  }

  public String sampleMethod() {
    return value;
  }

  @PreDestroy
  public void destroy() {
    System.out.println("Im inside destroy...");
  }

  @Override
  public void start() {
    // TODO Auto-generated method stub
  }

  @Override
  public void stop() {
    System.out.println("Im inside stop...");
  }

  @Override
  public boolean isRunning() {
    // stop won't be called if return false
    return true;
  }

  @Override
  public int getPhase() {
    // Returning Integer.MAX_VALUE only suggests that
    // we will be the first bean to shutdown and last bean to start
    return 0;
  }

  @Override
  public boolean isAutoStartup() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void stop(Runnable callback) {
    System.out.println("Im inside stop with callback...");

    // Shudown complete. Regular shutdown will continue.
    callback.run();
  }

}
