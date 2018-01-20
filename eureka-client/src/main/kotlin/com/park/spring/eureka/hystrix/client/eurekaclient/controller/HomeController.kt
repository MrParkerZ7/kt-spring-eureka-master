package com.park.spring.eureka.hystrix.client.eurekaclient.controller

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject

@RestController
@RequestMapping("/home")
class HomeController(@Autowired var restTemplate: RestTemplate) {

    @HystrixCommand(fallbackMethod = "fallback", groupKey = "Home", commandKey = "home", threadPoolKey = "helloThread")
    @GetMapping
    fun home(): String? {
        val url = "http://eureka-server/home"
        return restTemplate.getForObject(url, Any())
    }

    fun fallback(): String = "Client: Server not found!!"

}