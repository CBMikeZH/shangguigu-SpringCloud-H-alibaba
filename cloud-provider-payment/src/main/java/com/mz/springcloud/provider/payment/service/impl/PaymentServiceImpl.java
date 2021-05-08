package com.mz.springcloud.provider.payment.service.impl;

import com.mz.springcloud.provider.payment.dao.PaymentDao;
import com.mz.springcloud.api.entities.commons.CommonResult;
import com.mz.springcloud.api.entities.payment.Payment;
import com.mz.springcloud.provider.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Value("${server.port}")
    private String serverPort;

    @Override
    public CommonResult createPayment(Payment payment) {
        int i = paymentDao.createPayment(payment);
        CommonResult result;
        if (i > 0) {
            result = new CommonResult(200, "创建订单成功, serverPort: " + serverPort, i);
        } else {
            result = new CommonResult(400, "创建订单失败, serverPort: " + serverPort, null);
        }
        log.info("method:createPayment,result:" + result);
        return result;
    }

    @Override
    public CommonResult getPaymentById(Long id) {
        Payment payment = paymentDao.getPaymentById(id);
        CommonResult result;
        if (payment != null) {
            result = new CommonResult(200, "查询订单成功, serverPort: " + serverPort, payment);
        } else {
            result = new CommonResult(400, "没有查询到订单, serverPort: " + serverPort, null);
        }
        log.info("method:getPaymentById,result:" + result);
        return result;
    }
}
