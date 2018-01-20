package com.park.spring.eureka.hystrix.client.eurekaclient.config

import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate


@Configuration
class Config {

    @LoadBalanced
    @Bean
    fun restTemplate(): RestTemplate = RestTemplate()
}