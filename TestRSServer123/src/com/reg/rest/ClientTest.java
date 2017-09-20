package com.reg.rest;


 
import com.sun.jersey.api.core.PackagesResourceConfig;
import javax.ws.rs.ApplicationPath;
 
@ApplicationPath("/")
public class ClientTest extends PackagesResourceConfig {
 
    public ClientTest() {
        super("com.giantflyingsaucer");
    }
}