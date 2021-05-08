package com.mz.springcloud.provider.payment.controller;

import com.mz.springcloud.api.entities.commons.CommonResult;
import com.mz.springcloud.api.entities.payment.Payment;
import com.mz.springcloud.provider.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/payment/create")
    public CommonResult createPayment(@RequestBody Payment payment) {
        return paymentService.createPayment(payment);
    }

    @GetMapping("/payment/getById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        return paymentService.getPaymentById(id);
    }

}
