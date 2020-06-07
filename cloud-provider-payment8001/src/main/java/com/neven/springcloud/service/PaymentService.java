package com.neven.springcloud.service;

import com.neven.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    Payment selectById(@Param("id") Long id);

    int insert(Payment payment);
}
