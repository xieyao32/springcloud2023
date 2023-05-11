package com.xy.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.xy.springcloud.entities.CommonResult;
import org.springframework.stereotype.Component;

public class CustomerBlockHandler
{
    public static CommonResult handleException(BlockException exception){
        return new CommonResult(444,"自定义的限流处理信息......CustomerBlockHandler111");
    }

    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(444,"自定义的限流处理信息......CustomerBlockHandler222");
    }
}
