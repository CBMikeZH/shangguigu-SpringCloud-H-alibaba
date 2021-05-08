package com.mz.springcloud.provider.payment.dao;

import com.mz.springcloud.api.entities.payment.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    public int createPayment(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
