package com.atguigu.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *@project:
 *@description:
 *@author:zhangwenqiang
 *@date: 2020/4/12
 */
@Component
@FeignClient(name = "CLOUD-PROVIDER-HYSTRIX-SERVICE")
public interface PaymentHystrixService {

	@GetMapping("/payment/hystrix/ok/{id}")
	public String paymentInfo_OK(@PathVariable("id") Integer id);

	@GetMapping("/payment/hystrix/timeout/{id}")
	public String paymentInfo_TimeOut(@PathVariable("id") Integer id);
}
