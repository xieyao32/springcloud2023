package com.xy.springcloud.service;

import com.xy.springcloud.entities.CommonResult;
import com.xy.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @auther zzyy
 * @create 2019-12-10 17:18
 */
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(444,"服务降级返回,没有该流水信息",new Payment(id, "errorSerial......"));
    }
}
