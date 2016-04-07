package com.hp.mobile.controller;

import com.hp.mobile.domain.Device;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

//import org.junit.runner.RunWith;

/**
 * Created by Spieler Orasio
 * on 07-Apr-16.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Device.class})
@WebIntegrationTest("server.port:9000")
public class DeviceControllerTest {
    RestTemplate restTemplate = new TestRestTemplate();

//    @Test
    public void shouldAdd_AppUser_ToDb(){
        ResponseEntity<List> responseEntity = restTemplate.getForEntity("http://localhost:9000/device/all", List.class);
        final List<Device> devices = responseEntity.getBody();
        Assert.assertNotNull(devices);
        Assert.assertTrue(devices.size()>0);
    }
}
