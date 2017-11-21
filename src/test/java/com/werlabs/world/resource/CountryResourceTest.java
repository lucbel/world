package com.werlabs.world.resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by rodrigo on 21/11/17.
 */
@Ignore
@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CountryResourceTest {


    @Autowired
    TestRestTemplate testRestTemplate;


    @Test
    public void contextLoads() {
        ResponseEntity<String> entity = this.testRestTemplate.getForEntity("/city",
                String.class);
        assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}
