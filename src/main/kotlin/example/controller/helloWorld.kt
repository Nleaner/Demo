package example.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class helloWorld{
    @RequestMapping("/hello")
    fun helloWorld(): String{
        return "hello xuqiang"
    }
}