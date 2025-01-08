package hana.k8s.k8s_practice.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AppController {

    @GetMapping("/")
    fun index(): String {
        return "hello world"
    }

    @GetMapping("/hello")
    fun hello(): String {
        return "hello world!!!"
    }

}
