package com.gong3000.xiaoming;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("score")
public interface ScoreClient {

    /**
     * ping
     */
    @RequestMapping(value = {"/ping"}, method = RequestMethod.GET)
    String ping();

}
