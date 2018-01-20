package com.park.spring.eureka.server.second.eurekaserversecond

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class EurekaServerSecondApplication

fun main(args: Array<String>) {
    runApplication<EurekaServerSecondApplication>(*args)
}
