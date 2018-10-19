package com.be.appone.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.be.appone.common.feignapi.AppTwoFeignProxy;
import com.be.appone.common.repo.RegionRepository;

@Controller
public class AppOneControllerImpl implements AppOneController {

    @Autowired
    RegionRepository regionRepository;

    @Autowired
    private AppTwoFeignProxy appTwoFeignProxy;

    @Override
    public ResponseEntity< ? > regionListAll() {
        return new ResponseEntity<>(regionRepository.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity< ? > jobFeignListAll() {
        return appTwoFeignProxy.jobListAll();
    }

}
