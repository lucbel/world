package com.werlabs.world;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by rodrigo on 18/11/17.
 */

@SpringBootApplication
@EnableAutoConfiguration
public class MainConfiguration extends SpringBootServletInitializer {


 public MainConfiguration(){
     System.out.println("Initialized");
 }

    public static void main(String[] args) {
        new MainConfiguration()
                .configure(new SpringApplicationBuilder(MainConfiguration.class))
                .run(args);
    }

}
