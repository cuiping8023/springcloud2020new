package com.neven.springcloud.service.impl;

import com.neven.springcloud.dao.PaymentMapper;
import com.neven.springcloud.entity.Payment;
import com.neven.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentMapper paymentMapper;
    @Override
    public Payment selectById(Long id) {
        return paymentMapper.selectById(id);
    }

    @Override
    public int insert(Payment payment) {

        return paymentMapper.insert(payment);
    }
}
