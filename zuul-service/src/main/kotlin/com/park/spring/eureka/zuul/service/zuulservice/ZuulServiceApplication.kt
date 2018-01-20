package com.park.spring.eureka.zuul.service.zuulservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
class ZuulServiceApplication

fun main(args: Array<String>) {
    runApplication<ZuulServiceApplication>(*args)
}
