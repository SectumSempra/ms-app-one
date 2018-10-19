package com.be.appone.common.feignapi;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "app-two-services")
@RibbonClient(name = "app-two-services")
public interface AppTwoFeignProxy {

    @GetMapping(value = "/api/job-list-all")
    public ResponseEntity< ? > jobListAll();

}
