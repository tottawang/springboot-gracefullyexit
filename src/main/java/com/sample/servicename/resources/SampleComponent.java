package com.sample.servicename.resources;

import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class SampleComponent {

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

}
