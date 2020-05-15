package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *@project:
 *@description:
 *@author:zhangwenqiang
 *@date: 2020/5/8
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigMain3377 {
	public static void main(String[] args) {
		SpringApplication.run(NacosConfigMain3377.class, args);
	}
}