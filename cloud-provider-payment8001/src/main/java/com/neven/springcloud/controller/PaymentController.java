package com.neven.springcloud.controller;

import com.neven.commons.entity.BastResult;
import com.neven.springcloud.entity.Payment;
import com.neven.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @RequestMapping("/create")
    public BastResult create(@RequestBody Payment payment ) {
        log.info("插入成功");
        return new BastResult("0", "", paymentService.insert(payment));


    }

    @RequestMapping("/index")
    public String index(){
        return  "hello";
    }

    @RequestMapping("/selectById")
    public BastResult<Object> selectById(Long id) {
        BastResult bastResult = new BastResult("0", "", paymentService.selectById(id));

        return bastResult;
    }
}
