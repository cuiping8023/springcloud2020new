package com.neven.springcloud.dao;

import com.neven.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {

    Payment selectById(@Param("id") Long id);

    int insert(Payment payment);
}
