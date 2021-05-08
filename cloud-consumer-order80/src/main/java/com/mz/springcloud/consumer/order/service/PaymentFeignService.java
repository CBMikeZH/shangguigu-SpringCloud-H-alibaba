package com.mz.springcloud.consumer.order.service;

import com.mz.springcloud.api.entities.commons.CommonResult;
import com.mz.springcloud.api.entities.payment.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @PostMapping("/payment/create")
    public CommonResult createPayment(@RequestBody Payment payment);

    @GetMapping("/payment/getById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);

}
