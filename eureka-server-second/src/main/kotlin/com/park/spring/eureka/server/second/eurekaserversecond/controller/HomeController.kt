package com.park.spring.eureka.server.second.eurekaserversecond.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.client.ServiceInstance
import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")
class HomeController {

    @GetMapping
    fun home(): String = "Home Server 2!!"
}

@RestController
@RequestMapping("/service-instance")
class ServiceInstanceController(@Autowired private var discoveryClient: DiscoveryClient) {

    @GetMapping("/{appName}")
    fun showServiceInstance(@PathVariable("appName") appName: String): List<ServiceInstance> = this.discoveryClient.getInstances(appName)!!

}