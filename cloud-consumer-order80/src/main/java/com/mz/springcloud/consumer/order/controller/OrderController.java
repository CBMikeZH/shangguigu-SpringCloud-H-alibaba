package com.mz.springcloud.consumer.order.controller;

import com.mz.springcloud.api.entities.commons.CommonResult;
import com.mz.springcloud.api.entities.payment.Payment;
import com.mz.springcloud.consumer.order.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/create")
    public CommonResult createPayment(Payment payment) {
        return paymentFeignService.createPayment(payment);
    }

    @GetMapping("/consumer/payment/getById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

}
