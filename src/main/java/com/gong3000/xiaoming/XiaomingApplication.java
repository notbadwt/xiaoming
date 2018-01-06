package com.gong3000.xiaoming;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class XiaomingApplication {

    @Autowired
    public XiaomingApplication(ScoreClient scoreClient) {
        this.scoreClient = scoreClient;
    }

    public static void main(String[] args) {
        SpringApplication.run(XiaomingApplication.class, args);
    }

    private final ScoreClient scoreClient;

    @RequestMapping({"/ping"})
    public String scorePing() {
        return "success";
    }
}
