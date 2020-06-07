package com.neven.consumer.controller;

import com.neven.commons.entity.BastResult;
import com.neven.consumer.entity.Payment;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    public static final String PAYMENT_URL = "http://localhost:8001";

    @RequestMapping("createPayment")
    public BastResult createPayment(@RequestBody Payment payment){

        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,BastResult.class);
    }
}
