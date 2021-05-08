package com.mz.springcloud.provider.payment.service;

import com.mz.springcloud.api.entities.commons.CommonResult;
import com.mz.springcloud.api.entities.payment.Payment;

public interface PaymentService {

    public CommonResult createPayment(Payment payment);

    public CommonResult getPaymentById(Long id);
}
