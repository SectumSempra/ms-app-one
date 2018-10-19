package com.be.appone.common.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public interface AppOneController {

    @RequestMapping(value = "/region-list-all", method = RequestMethod.GET)
    public ResponseEntity< ? > regionListAll();

    @RequestMapping(value = "/job-feign-list-all", method = RequestMethod.GET)
    public ResponseEntity< ? > jobFeignListAll();

}
