package com.sample.servicename.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Path("/sample")
public class SampleResource {

  @Autowired
  @Qualifier("sampleComponent")
  private SampleComponent shellComponent;

  @GET
  @Produces("text/plain")
  public String getSample() {
    return shellComponent.sampleMethod();
  }

}
